package Models;

import Interfaces.ParkingLotFloorChangeObserver;
import Interfaces.ParkingSpotChoosingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FirstAvailableParkingSpotChoosingStrategy implements ParkingSpotChoosingStrategy, ParkingLotFloorChangeObserver {
    List<ParkingLotFloor> parkingLotFloors = new ArrayList<>();
    @Override
    public ParkingSpot getParkingSpot(VehicleType vehicleType) {
        for(ParkingLotFloor parkingLotFloor: parkingLotFloors){
            for(ParkingSpot parkingSpot:parkingLotFloor.parkingSpots){
                if(Objects.equals(parkingSpot.parkingSpotSize.toString(), vehicleType.toString())){
                    return parkingSpot;
                }
            }
        }
        return null;
    }

    @Override
    public void addParkingLotFloor(ParkingLotFloor parkingLotFloor) {
        parkingLotFloors.add(parkingLotFloor);
    }

    @Override
    public void removeParkingLotFloor(ParkingLotFloor parkingLotFloor) {
        parkingLotFloors.add(parkingLotFloor);
    }
}
