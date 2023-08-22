package Models;

import Interfaces.ParkingSpotChoosingStrategy;

public class EntryGate extends Gate{
    ParkingAttendant parkingAttendant;
    DisplayBoard entranceDisplayBoard;
    ParkingSpotChoosingStrategy parkingSpotChoosingStrategy;
    Ticket getTicket(Vehicle vehicle){
        ParkingSpot parkingSpot = parkingSpotChoosingStrategy.getParkingSpot(vehicle.vehicleType);
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        return new Ticket(vehicle.vehicleNumber, parkingSpot);
    }
}
