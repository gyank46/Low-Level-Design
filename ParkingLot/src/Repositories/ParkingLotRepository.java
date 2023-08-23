package Repositories;

import Models.ParkingLot;
import Models.ParkingLotFloor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingLotRepository {
    private static long IdCounter=0;
    public static HashMap<Long, ParkingLot> parkingLots = new HashMap<>();
    public static HashMap<Long,List<Long>> parkingLotParkingLotFloorMap = new HashMap<>();
    public static void addParkingLot(ParkingLot parkingLot){
        parkingLot.setParkingLotId(IdCounter);
        IdCounter++;
        parkingLots.put(parkingLot.getParkingLotId(),parkingLot);
    }

    public static void removeParkingLot(long parkingLotId){
        parkingLots.remove(parkingLotId);
        IdCounter--;
        parkingLotParkingLotFloorMap.remove(parkingLotId);
    }

    public static void addParkingLotFloorToParkingLot(long parkingLotId, long parkingLotFloorId){
        if(!parkingLotParkingLotFloorMap.containsKey(parkingLotId)){
            parkingLotParkingLotFloorMap.put(parkingLotId,new ArrayList<>());
        }
        parkingLotParkingLotFloorMap.get(parkingLotId).add(parkingLotFloorId);
    }

    public static void removeParkingLotFloorFromParkingLot(long parkingLotId, long parkingLotFloorId){
        parkingLotParkingLotFloorMap.get(parkingLotId).remove(parkingLotFloorId);
    }

    public static ParkingLot getParkingLot(long parkingLotId){
        return parkingLots.get(parkingLotId);
    }

    public static List<Long> getParkingLotFloorsForParkingLot(long parkingLotId){
        return parkingLotParkingLotFloorMap.get(parkingLotId);
    }
}
