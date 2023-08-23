package Repositories;

import Models.ParkingLotFloor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingLotFloorRepository {
    private static long IdCounter=0;
    public static HashMap<Long, ParkingLotFloor> parkingLotFloors = new HashMap<>();
    public static HashMap<Long,List<Long>> parkingLotFloorToParkingSpotMap = new HashMap<>();
    public static void addParkingLotFloor(ParkingLotFloor parkingLotFloor){
        parkingLotFloor.setParkingLotFloorId(IdCounter);
        IdCounter++;
        parkingLotFloors.put(parkingLotFloor.getParkingLotFloorId(),parkingLotFloor);
    }

    public static void removeParkingLotFloor(long parkingLotFloorId){
        parkingLotFloors.remove(parkingLotFloorId);
        parkingLotFloorToParkingSpotMap.remove(parkingLotFloorId);
        IdCounter--;
    }

    public static ParkingLotFloor getParkingLotFloor(long parkingLotFloorId){
        return parkingLotFloors.get(parkingLotFloorId);
    }

    public static void addParkingSpotToParkingFloor(long parkingFloorId, long parkingSpotId){
        if(!parkingLotFloorToParkingSpotMap.containsKey(parkingFloorId)){
            parkingLotFloorToParkingSpotMap.put(parkingFloorId,new ArrayList<>());
        }
        parkingLotFloorToParkingSpotMap.get(parkingFloorId).add(parkingSpotId);
    }

    public static void removeParkingSpotFromParkingFloor(long parkingFloorId, long parkingSpotId){
        parkingLotFloorToParkingSpotMap.get(parkingFloorId).remove(parkingSpotId);
    }

    public static List<Long> getParkingSpotsForParkingFloor(long parkingLotFloorId){
        return parkingLotFloorToParkingSpotMap.get(parkingLotFloorId);
    }


}
