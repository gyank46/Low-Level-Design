package Controllers;

import Exceptions.InvalidTicketException;
import Exceptions.SpotNotAvailableException;
import Models.ParkingLot;
import Models.Ticket;
import Models.Vehicle;
import Services.ParkingLotService;

public class ParkingLotController {

    ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService){
        this.parkingLotService = parkingLotService;
    }

    public ParkingLot createParkingLot(String parkingLotId, String address, Long noOfFloor, Long noOfSpotsPerFloor){
        return parkingLotService.createParkingLot(parkingLotId,address,noOfFloor,noOfSpotsPerFloor);
    }

    public void deleteParkingLot(String parkingLotId){
        parkingLotService.deleteParkingLot(parkingLotId);
    }

    public ParkingLot addParkingLotFloorToParkingLot(String parkingLotId,Long noOfSpotsPerFloor){
        return parkingLotService.addParkingLotFloorToParkingLot(parkingLotId,noOfSpotsPerFloor);
    }

    public void parkVehicleToParkingLot(Vehicle vehicle,String parkingLotId){
        try{
            Ticket ticket = parkingLotService.parkVehicleToParkingLot(vehicle,parkingLotId);
            System.out.println("Vehicle parked with ticket Id: "+ ticket.getId());
        } catch (SpotNotAvailableException e) {
            System.out.println(e.getMessage());
        }

    }

    public void unParkVehicleWithTicketId(String ticketId){
        try{
            parkingLotService.unParkVehicleWithTicketId(ticketId);
        }catch (InvalidTicketException e){
            System.out.println(e.getMessage());
        }
    }

}
