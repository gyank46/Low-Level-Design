package Models;

import Interfaces.ParkingSpotChangeObserver;
import Interfaces.Payee;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotFloor implements ParkingSpotChangeObserver {
    Payee payee;
    DisplayBoard displayBoard;
    List<ParkingSpot> parkingSpots = new ArrayList<>();
//    List<ParkingSpot> availableParkingSpots = new ArrayList<>();
    void makePayment(Vehicle vehicle){
        payee.makePayment(0);
    }

    void displayStatus(){
        displayBoard.displayStatus(parkingSpots);
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }


    @Override
    public void updateParkingSpotStatus(ParkingSpot parkingSpot, ParkingSpotStatus parkingSpotStatus) {
        if(parkingSpots.contains(parkingSpot)){
            parkingSpot.setParkingSpotStatus(parkingSpotStatus);
        }
    }
}
