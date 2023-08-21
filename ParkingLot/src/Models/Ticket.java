package Models;

import java.time.LocalTime;

public class Ticket {
    String vehicleNumber;
    String parkingSpotId;
    LocalTime entryTime;
    double amountPaid;

    public Ticket(String vehicleNumber,String parkingSpotId){
        this.parkingSpotId = parkingSpotId;
        this.vehicleNumber = vehicleNumber;
        amountPaid = 0;
        entryTime = LocalTime.now();
    }
}
