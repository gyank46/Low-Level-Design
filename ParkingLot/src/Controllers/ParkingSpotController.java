package Controllers;

import Models.ParkingSpot;
import Models.ParkingSpotStatus;
import Models.VehicleType;
import Services.ParkingSpotService;

public class ParkingSpotController {
    ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService){
        this.parkingSpotService = parkingSpotService;
    }

    public ParkingSpot createParkingSpot(VehicleType vehicleType){
        return parkingSpotService.addParkingSpot(vehicleType);
    }

    public void removeParkingSpot(long parkingSpotId){
        parkingSpotService.removeParkingSpot(parkingSpotId);
    }

    public void updateParkingSpot(long parkingSpotId, ParkingSpotStatus parkingSpotStatus){
        parkingSpotService.updateParkingSpotStatus(parkingSpotId,parkingSpotStatus);
    }

}
