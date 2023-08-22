import Interfaces.ParkingSpotChoosingStrategy;
import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ParkingLotFloor parkingLotFloor = new ParkingLotFloor();
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for(ParkingSpotSize parkingSpotSize:ParkingSpotSize.values()){
            for(int i=0;i<10;i++){
                parkingLotFloor.addParkingSpot(new ParkingSpot(ParkingSpotStatus.AVAILABLE,parkingSpotSize));
            }
        }
        ParkingSpotChoosingStrategy parkingSpotChoosingStrategy = new FirstAvailableParkingSpotChoosingStrategy();
        ParkingLot parkingLot = new ParkingLot(100);
        parkingLot.addParkingLotChangeObserver(parkingSpotChoosingStrategy);
        parkingLot.addParkingLotFloor(parkingLotFloor);
        parkingLot.displayAvailableSpots();
    }
}