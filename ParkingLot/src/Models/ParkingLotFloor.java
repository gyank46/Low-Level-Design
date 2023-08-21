package Models;

import java.util.List;

public class ParkingLotFloor {
    Payee payee;
    DisplayBoard displayBoard;
    List<ParkingSpot> parkingSpots;
    List<ParkingSpot> availableParkingSpots;
    void makePayment(Vehicle vehicle){
        payee.makePayment(0);
    }

    void displayStatus(){
        displayBoard.displayStatus(availableParkingSpots);
    }

    void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }


}
