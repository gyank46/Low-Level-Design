package Models;

import Interfaces.*;

import java.util.*;

public class ParkingLot {
    List<ParkingLotFloor> parkingLotFloors = new ArrayList<>();
    List<EntryGate> entryGates = new ArrayList<>();
    List<ExitGate> exitGates = new ArrayList<>();

    EntryGateChoosingStrategy entryGateChoosingStrategy;
    ExitGateChoosingStrategy exitGateChoosingStrategy;
    List<EntryGateChangeObserver> entryGateChangeObservers = new ArrayList<>();
    List<ExitGateChangeObserver> exitGateChangeObservers = new ArrayList<>();

    List<ParkingLotFloorChangeObserver> parkingLotFloorChangeObservers = new ArrayList<>();

    DisplayBoard displayBoard;
    int capacity;

    public ParkingLot(int capacity){
        this.capacity = capacity;
    }

    public void addEntryGate(EntryGate entryGate){
        entryGates.add(entryGate);
        for(EntryGateChangeObserver entryGateChangeObserver:entryGateChangeObservers){
            entryGateChangeObserver.updateEntryGateCount(entryGates.size());
        }
    }

    public void addExitGate(ExitGate exitGate){
        exitGates.add(exitGate);
        for(ExitGateChangeObserver exitGateChangeObserver:exitGateChangeObservers){
            exitGateChangeObserver.updateEntryGateCount(exitGates.size());
        }
    }

    public void addParkingLotFloor(ParkingLotFloor parkingLotFloor){
        this.parkingLotFloors.add(parkingLotFloor);
        for(ParkingLotFloorChangeObserver parkingLotFloorChangeObserver: parkingLotFloorChangeObservers){
            parkingLotFloorChangeObserver.addParkingLotFloor(parkingLotFloor);
        }
    }

    public void removeParkingLotFloor(ParkingLotFloor parkingLotFloor){
        this.parkingLotFloors.remove(parkingLotFloor);
        for(ParkingLotFloorChangeObserver parkingLotFloorChangeObserver: parkingLotFloorChangeObservers){
            parkingLotFloorChangeObserver.removeParkingLotFloor(parkingLotFloor);
        }
    }

    public Ticket parkVehicle(Vehicle vehicle){
        EntryGate entryGate = entryGates.get(entryGateChoosingStrategy.getEntryGate());
        return entryGate.getTicket(vehicle);
    }

    public void addEntryGateChangeObserver(EntryGateChoosingStrategy entryGateChoosingStrategy){
        entryGateChangeObservers.add((EntryGateChangeObserver) entryGateChoosingStrategy);
    }

    public void addExitGateChangeObserver(ExitGateChoosingStrategy exitGateChoosingStrategy){
        exitGateChangeObservers.add((ExitGateChangeObserver) exitGateChoosingStrategy);
    }

    public void addParkingLotChangeObserver(ParkingSpotChoosingStrategy parkingSpotChoosingStrategy){
        parkingLotFloorChangeObservers.add((ParkingLotFloorChangeObserver) parkingSpotChoosingStrategy);
    }

    public void unParkVehicle(Vehicle vehicle,Ticket ticket){
        ExitGate exitGate = exitGates.get(exitGateChoosingStrategy.getExitGate());
        if(!Objects.equals(ticket.vehicleNumber, vehicle.vehicleNumber)){
            throw new RuntimeException("Vehicle Number not matching with vehicle number of ticket");
        }
        exitGate.makePayment(ticket);
    }

    public void displayAvailableSpots(){
        HashMap<ParkingSpotSize,Integer> parkingSpotSizeCountMap = new HashMap<>();
        for(ParkingLotFloor parkingLotFloor: parkingLotFloors){
            List<ParkingSpot> parkingSpots = parkingLotFloor.parkingSpots;
            displayBoard.displayStatus(parkingSpots);
        }

    }

}
