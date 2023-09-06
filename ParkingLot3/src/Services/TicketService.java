package Services;

import Models.Ticket;
import Repositories.TicketRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
public class TicketService {

    TicketRepository ticketRepository;


    public Ticket createTicket(String parkingLotId, Long floorNumber, Long parkingSpotNumber) {
        Ticket ticket = new Ticket(parkingLotId,floorNumber,parkingSpotNumber);
        return ticketRepository.saveTicket(ticket);
    }

    public Ticket getTicketById(String ticketId) {
        return ticketRepository.getTicket(ticketId);
    }
}
