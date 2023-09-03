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
        return parkingLotRepository.saveParkingLot(parkingLot);
    }
}
