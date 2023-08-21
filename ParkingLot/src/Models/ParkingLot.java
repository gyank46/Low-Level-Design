package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    List<ParkingLotFloor> parkingLotFloors = new ArrayList<>();
    List<EntryGate> entryGates = new ArrayList<>();
    List<ExitGate> exitGates = new ArrayList<>();

    EntryGateChoosingStrategy entryGateChoosingStrategy;
    ExitGateChoosingStrategy exitGateChoosingStrategy;

    DisplayBoard displayBoard;
    int capacity;

    ParkingLot(int capacity){
        this.capacity = capacity;
    }

    void addParkingLotFloor(ParkingLotFloor parkingLotFloor){
        parkingLotFloors.add(parkingLotFloor);
    }

    void addEntryGate(EntryGate entryGate){
        entryGates.add(entryGate);
    }

    void addExitGate(ExitGate exitGate){
        exitGates.add(exitGate);
    }

    Ticket parkVehicle(Vehicle vehicle){
        EntryGate entryGate = entryGates.get(entryGateChoosingStrategy.getEntryGate());
        return entryGate.getTicket(vehicle);
    }

    void unParkVehicle(Vehicle vehicle){
        ExitGate exitGate = exitGates.get(exitGateChoosingStrategy.getExitGate());
        exitGate.makePayment(null);
    }

    void displayAvailableSpots(Vehicle vehicle){
        HashMap<ParkingSpotSize,Integer> parkingSpotSizeCountMap = new HashMap<>();
        for(ParkingLotFloor parkingLotFloor: parkingLotFloors){
            List<ParkingSpot> parkingSpots = parkingLotFloor.availableParkingSpots;
            for(ParkingSpot parkingSpot: parkingSpots){
                int currentCount = parkingSpotSizeCountMap.get(parkingSpot.parkingSpotSize);
                parkingSpotSizeCountMap.put(parkingSpot.parkingSpotSize,currentCount+1);
            }
        }
        for (Map.Entry<ParkingSpotSize, Integer> entry : parkingSpotSizeCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
