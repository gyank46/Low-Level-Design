package Repositories;

import Models.ParkingLotFloor;
import Models.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {
    private static long IdCounter=0;
    public static HashMap<Long, ParkingSpot> parkingSpots = new HashMap<>();
    public static void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpot.setParkingSpotId(IdCounter);
        IdCounter++;
        parkingSpots.put(parkingSpot.getParkingSpotId(),parkingSpot);
    }

    public static void removeParkingSpot(long parkingSpotId){
        parkingSpots.remove(parkingSpotId);
        IdCounter--;
    }

    public static ParkingSpot getParkingSpot(long parkingSpotId){
        return parkingSpots.get(parkingSpotId);
    }

    public static void updateParkingSpot(long parkingSpotId, ParkingSpot parkingSpot){
        parkingSpots.put(parkingSpotId,parkingSpot);
    }
}
