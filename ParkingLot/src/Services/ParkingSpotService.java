package Services;

import Models.ParkingSpot;
import Models.ParkingSpotStatus;
import Models.VehicleType;
import Repositories.ParkingLotFloorRepository;
import Repositories.ParkingSpotRepository;

public class ParkingSpotService {
    public void updateParkingSpotStatus(long parkingSpotId, ParkingSpotStatus parkingSpotStatus){
        ParkingSpot parkingSpot = ParkingSpotRepository.getParkingSpot(parkingSpotId);
        ParkingSpotRepository.updateParkingSpot(parkingSpotId,parkingSpot);
    }

    public ParkingSpot addParkingSpot(VehicleType vehicleType){
        ParkingSpot parkingSpot = new ParkingSpot(vehicleType);
        ParkingSpotRepository.addParkingSpot(parkingSpot);
        return parkingSpot;
    }

    public void removeParkingSpot(long parkingSpotId){
        ParkingSpotRepository.removeParkingSpot(parkingSpotId);
    }
}
