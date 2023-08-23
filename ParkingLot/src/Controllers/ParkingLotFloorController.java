package Controllers;

import Models.ParkingLotFloor;
import Models.ParkingSpot;
import Models.Vehicle;
import Models.VehicleType;
import Services.ParkingLotFloorService;

import java.security.PublicKey;

public class ParkingLotFloorController {
    ParkingLotFloorService parkingLotFloorService;

    public ParkingLotFloorController(ParkingLotFloorService parkingLotFloorService){
        this.parkingLotFloorService = parkingLotFloorService;
    }

    public void deleteParkingLotFloor(long parkingLotFloorId){
        parkingLotFloorService.removeParkingLotFloor(parkingLotFloorId);
    }

    public ParkingLotFloor createParkingLotFloor(){
        return parkingLotFloorService.createParkingLotFloor();
    }

    public ParkingSpot addParkingSpotToParkingLotFloor(VehicleType vehicleType,long parkingLotFloorId){
        return parkingLotFloorService.addParkingSpotToParkingLotFloor(vehicleType,parkingLotFloorId);
    }

    public void removeParkingSpotFromParkingLotFloor(long parkingLotFloorId, long parkingSpotId){
        parkingLotFloorService.removeParkingSpotFromParkingLotFloor(parkingLotFloorId,parkingSpotId);
    }

}
