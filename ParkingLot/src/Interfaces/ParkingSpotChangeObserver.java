package Interfaces;

import Models.ParkingSpot;
import Models.ParkingSpotStatus;

public interface ParkingSpotChangeObserver {
    void updateParkingSpotStatus(ParkingSpot parkingSpot, ParkingSpotStatus parkingSpotStatus);
}
