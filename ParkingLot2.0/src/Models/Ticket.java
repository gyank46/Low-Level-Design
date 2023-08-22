package Models;

import java.time.LocalTime;

public class Ticket {
    String vehicleNumber;
    ParkingSpot parkingSpot;
    LocalTime entryTime;
    double amountPaid;

    public Ticket(String vehicleNumber,ParkingSpot parkingSpot){
        this.parkingSpot = parkingSpot;
        this.vehicleNumber = vehicleNumber;
        amountPaid = 0;
        entryTime = LocalTime.now();
    }
}
