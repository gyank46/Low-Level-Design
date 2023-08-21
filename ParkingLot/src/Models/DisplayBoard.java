package Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {

    public void displayStatus(List<ParkingSpot> parkingSpots){
        HashMap<ParkingSpotSize,Integer> parkingSpotSizeCountMap = new HashMap<>();
        for(ParkingSpot parkingSpot: parkingSpots){
            int currentCount = parkingSpotSizeCountMap.get(parkingSpot.parkingSpotSize);
            parkingSpotSizeCountMap.put(parkingSpot.parkingSpotSize,currentCount+1);
        }
        for (Map.Entry<ParkingSpotSize, Integer> entry : parkingSpotSizeCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
