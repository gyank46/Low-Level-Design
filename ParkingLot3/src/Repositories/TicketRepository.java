package Repositories;

import Models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    HashMap<String, Ticket> ticketRepository = new HashMap<>();


    public Ticket saveTicket(Ticket ticket) {
        ticketRepository.put(ticket.getId(),ticket);
        return ticket;
    }

    public Ticket getTicket(String ticketId) {
        return ticketRepository.get(ticketId);
    }


}
