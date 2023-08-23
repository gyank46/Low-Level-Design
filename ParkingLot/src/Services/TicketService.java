package Services;

import Models.ParkingSpot;
import Models.PaymentStatus;
import Models.Ticket;
import Models.Vehicle;
import Repositories.TicketRepository;

public class TicketService {
    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        Ticket ticket =  new Ticket(vehicle.getVehicleNumber(),parkingSpot.getParkingSpotId());
        TicketRepository.addTicket(ticket);
        return ticket;
    }
    public void updateTicketPaymentStatus(Ticket ticket, PaymentStatus paymentStatus){

    }
}
