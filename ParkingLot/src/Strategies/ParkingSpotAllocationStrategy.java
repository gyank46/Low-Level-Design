package Strategies;

import Models.ParkingSpot;
import Models.VehicleType;

public interface ParkingSpotAllocationStrategy {
    public ParkingSpot allocateParkingSpot(VehicleType vehicleType,long parkingLotId);
}
