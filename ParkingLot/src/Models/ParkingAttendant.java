package Models;

public class ParkingAttendant implements TicketIssuer,Payee{
    @Override
    public Ticket generateTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        return null;
    }

    @Override
    public void makePayment(Ticket ticket) {

    }
}
