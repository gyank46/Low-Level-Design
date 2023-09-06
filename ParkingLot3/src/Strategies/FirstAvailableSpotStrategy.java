package Strategies;

import Models.*;

import java.util.Objects;

public class FirstAvailableSpotStrategy implements SpotFindingStrategy{
    @Override
    public ParkingSpotFinderResult findParkingSpotForVehicleInParkingLot(Vehicle vehicle, ParkingLot parkingLot) {
        for(ParkingLotFloor parkingLotFloor:parkingLot.getParkingLotFloors()){
            for(ParkingLotSpot parkingLotSpot:parkingLotFloor.getParkingLotSpots()){
                if(Objects.equals(parkingLotSpot.getParkingSpotType().toString(), vehicle.getVehicleType().toString()) && parkingLotSpot.getParkingSpotStatus() == ParkingSpotStatus.AVAILABLE){
                    return new ParkingSpotFinderResult(parkingLotFloor,parkingLotSpot);
                }
            }
        }
        return null;
    }
}
