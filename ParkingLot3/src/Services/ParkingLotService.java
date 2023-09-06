package Services;

import Exceptions.InvalidTicketException;
import Exceptions.SpotNotAvailableException;
import Models.*;
import Repositories.ParkingLotRepository;
import Strategies.SpotFindingStrategy;

public class ParkingLotService {

    ParkingLotFloorService parkingLotFloorService;
    ParkingLotRepository parkingLotRepository;
    SpotFindingStrategy spotFindingStrategy;
    TicketService ticketService;
    ParkingLotSpotService parkingLotSpotService;

    public ParkingLotService(ParkingLotFloorService parkingLotFloorService,ParkingLotRepository parkingLotRepository,SpotFindingStrategy spotFindingStrategy,TicketService ticketService,ParkingLotSpotService parkingLotSpotService){
        this.parkingLotFloorService = parkingLotFloorService;
        this.parkingLotRepository = parkingLotRepository;
        this.spotFindingStrategy = spotFindingStrategy;
        this.ticketService = ticketService;
        this.parkingLotSpotService= parkingLotSpotService;
    }
    public ParkingLot createParkingLot(String parkingLotId, String address, Long noOfFloor, Long noOfSpotsPerFloor) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setParkingLotId(parkingLotId);
        parkingLot.setAddress(address);
        parkingLot.setNoOfFloors(noOfFloor);
        parkingLot.setNoOfSpotsPerFloor(noOfSpotsPerFloor);

        for(int i=0;i<noOfFloor;i++){
            Long parkingLotFloorId = i+1L;
            ParkingLotFloor parkingLotFloor = parkingLotFloorService.createParkingLotFloor(parkingLotFloorId,noOfSpotsPerFloor);
            parkingLot.getParkingLotFloors().add(parkingLotFloor);
        }
        System.out.println("created parking lot with parking lot id: "+parkingLotId);
        return parkingLotRepository.saveParkingLot(parkingLot);
    }

    public void deleteParkingLot(String parkingLotId) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(parkingLotId);
        for(ParkingLotFloor parkingLotFloor:parkingLot.getParkingLotFloors()){
            parkingLotFloorService.deleteParkingLotFloor(parkingLotFloor.getFloorNumber());
        }
        parkingLotRepository.removeParkingLotById(parkingLotId);
        System.out.println("Deleted parking lot with parking lot id: "+parkingLotId);
    }

    public ParkingLot addParkingLotFloorToParkingLot(String parkingLotId, Long noOfSpotsPerFloor) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(parkingLotId);
        Long newParkingLotFloorNumber = parkingLot.getParkingLotFloors().size()+1L;
        ParkingLotFloor parkingLotFloor = parkingLotFloorService.createParkingLotFloor(newParkingLotFloorNumber,noOfSpotsPerFloor);
        parkingLot.getParkingLotFloors().add(parkingLotFloor);
        parkingLotRepository.saveParkingLot(parkingLot);
        System.out.println("Added Parking Lot Floor with floor number: "+newParkingLotFloorNumber + " for parking lot id: "+parkingLotId);
        return parkingLot;
    }

    public Ticket parkVehicleToParkingLot(Vehicle vehicle, String parkingLotId) throws SpotNotAvailableException {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(parkingLotId);
        ParkingSpotFinderResult parkingSpotFinderResult = spotFindingStrategy.findParkingSpotForVehicleInParkingLot(vehicle,parkingLot);
        if(parkingSpotFinderResult == null){
            throw new SpotNotAvailableException("Spot not available.");
        }
        ParkingLotFloor parkingLotFloor = parkingSpotFinderResult.getParkingLotFloor();
        ParkingLotSpot parkingLotSpot = parkingSpotFinderResult.getParkingLotSpot();


        String ticketId = parkingLotId+"_"+parkingLotFloor.getFloorNumber()+"_"+parkingLotSpot.getParkingSpotNumber();
        parkingLotSpot.setParkingSpotStatus(ParkingSpotStatus.BOOKED);
        return ticketService.createTicket(parkingLotId,parkingLotFloor.getFloorNumber(),parkingLotSpot.getParkingSpotNumber());
    }

    public void unParkVehicleWithTicketId(String ticketId) throws InvalidTicketException {
        Ticket ticket = ticketService.getTicketById(ticketId);
        if(ticket == null){
            throw new InvalidTicketException("Invalid Ticket.");
        }
        ParkingLotSpot parkingLotSpot = parkingLotSpotService.getParkingLotSpotById(ticket.getParkingLotSpotNumber());
        parkingLotSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
    }
}
