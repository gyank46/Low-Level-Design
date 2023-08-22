package Interfaces;

import Models.ParkingLotFloor;

public interface ParkingLotFloorChangeObserver {
    void addParkingLotFloor(ParkingLotFloor parkingLotFloor);
    void removeParkingLotFloor(ParkingLotFloor parkingLotFloor);
}
