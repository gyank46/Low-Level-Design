package Strategies;

import Models.*;

public interface SpotFindingStrategy {
    public ParkingSpotFinderResult findParkingSpotForVehicleInParkingLot(Vehicle vehicle, ParkingLot parkingLot);
}
