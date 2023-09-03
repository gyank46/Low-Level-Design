package Controllers;

import Models.ParkingLot;
import Services.ParkingLotService;

public class ParkingLotController {

    ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService){
        this.parkingLotService = parkingLotService;
    }

    public ParkingLot createParkingLot(String parkingLotId, String address, Long noOfFloor, Long noOfSpotsPerFloor){
        return parkingLotService.createParkingLot(parkingLotId,address,noOfFloor,noOfSpotsPerFloor);

    }

}
