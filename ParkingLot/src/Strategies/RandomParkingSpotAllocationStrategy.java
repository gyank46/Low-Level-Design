package Strategies;

import Models.ParkingLotFloor;
import Models.ParkingSpot;
import Models.ParkingSpotStatus;
import Models.VehicleType;
import Repositories.ParkingLotFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingSpotRepository;

public class RandomParkingSpotAllocationStrategy implements ParkingSpotAllocationStrategy{
    @Override
    public ParkingSpot allocateParkingSpot(VehicleType vehicleType, long parkingLotId) {
        for(long parkingLotFloorId: ParkingLotRepository.getParkingLotFloorsForParkingLot(parkingLotId)){
            for(long parkingSpotId:ParkingLotFloorRepository.getParkingSpotsForParkingFloor(parkingLotFloorId)){
                ParkingSpot parkingSpot = ParkingSpotRepository.getParkingSpot(parkingSpotId);
                if(parkingSpot.getParkingSpotStatus() == ParkingSpotStatus.AVAILABLE && parkingSpot.getVehicleType() == vehicleType)
                    return parkingSpot;
            }
        }
        return null;
    }
}
