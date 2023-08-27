package Models;

public interface TicketIssuer {

    public Ticket generateTicket(ParkingSpot parkingSpot,Vehicle vehicle);
}
