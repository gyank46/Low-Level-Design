package Models;

public class AutomatedPanel implements TicketIssuer,Payee{
    @Override
    public void makePayment(Ticket ticket) {

    }

    @Override
    public Ticket generateTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        return null;
    }
}
