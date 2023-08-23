package Repositories;

import Models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private static long IdCounter=0;
    public static HashMap<Long, Ticket> tickets = new HashMap<>();

    public static void addTicket(Ticket ticket){
        ticket.setTicketId(IdCounter);
        IdCounter++;
        tickets.put(ticket.getTicketId(),ticket);
    }

    public static void deleteTicket(long ticketId){
        tickets.remove(ticketId);
        IdCounter--;
    }

    public static Ticket getTicket(long ticketId){
        return tickets.get(ticketId);
    }
}
