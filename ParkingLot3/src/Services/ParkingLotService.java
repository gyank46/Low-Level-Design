package Services;

import Models.ParkingLot;
import Models.ParkingLotFloor;
import Repositories.ParkingLotRepository;

public class ParkingLotService {

    ParkingLotFloorService parkingLotFloorService;
    ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotFloorService parkingLotFloorService,ParkingLotRepository parkingLotRepository){
        this.parkingLotFloorService = parkingLotFloorService;
        this.parkingLotRepository = parkingLotRepository;
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
}
