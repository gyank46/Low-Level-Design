package Services;

import Models.ParkingLotFloor;
import Models.ParkingSpot;
import Models.ParkingSpotStatus;
import Models.VehicleType;
import Repositories.ParkingLotFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingSpotRepository;

public class ParkingLotFloorService {

    public ParkingLotFloor createParkingLotFloor(){
        ParkingLotFloor parkingLotFloor = new ParkingLotFloor();
        ParkingLotFloorRepository.addParkingLotFloor(parkingLotFloor);
        return parkingLotFloor;
    }

    public void removeParkingLotFloor(long parkingLotFloorId){
        for(long parkingSpotId: ParkingLotFloorRepository.getParkingSpotsForParkingFloor(parkingLotFloorId)){
            new ParkingSpotService().removeParkingSpot(parkingSpotId);
        }
        ParkingLotFloorRepository.removeParkingLotFloor(parkingLotFloorId);
    }

    public ParkingSpot addParkingSpotToParkingLotFloor(VehicleType vehicleType, long parkingLotFloorId) {
        ParkingSpot parkingSpot = new ParkingSpotService().addParkingSpot(vehicleType);
        ParkingLotFloorRepository.addParkingSpotToParkingFloor(parkingLotFloorId,parkingSpot.getParkingSpotId());
        return parkingSpot;
    }

    public void removeParkingSpotFromParkingLotFloor(long parkingLotFloorId, long parkingSpotId) {
        new ParkingSpotService().removeParkingSpot(parkingSpotId);
        ParkingLotFloorRepository.removeParkingSpotFromParkingFloor(parkingLotFloorId,parkingSpotId);
    }
}
