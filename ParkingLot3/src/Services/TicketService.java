package Services;

import Models.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
public class TicketService {

    HashMap<String,Ticket> ticketRepository = new HashMap<>();


    public Ticket createTicket(String parkingLotId, Long floorNumber, Long parkingSpotNumber) {
        Ticket ticket = new Ticket(parkingLotId,floorNumber,parkingSpotNumber);
        return ticketRepository.put(ticket.getId(),ticket);
    }

    public Ticket getTicketById(String ticketId) {
        return ticketRepository.get(ticketId);
    }
}
