package Models;
public class EntryGate extends Gate{
    ParkingAttendant parkingAttendant;
    DisplayBoard entranceDisplayBoard;
    ParkingSpotChoosingStrategy parkingSpotChoosingStrategy;
    Ticket getTicket(Vehicle vehicle){
        ParkingSpot parkingSpot = parkingSpotChoosingStrategy.getParkingSpot(vehicle.vehicleType);
        return new Ticket(vehicle.vehicleNumber, parkingSpot.parkingSpotId);
    }
}
