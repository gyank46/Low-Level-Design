package Interfaces;

import Models.ParkingSpot;
import Models.VehicleType;

public interface ParkingSpotChoosingStrategy {
    ParkingSpot getParkingSpot(VehicleType vehicleType);
}
