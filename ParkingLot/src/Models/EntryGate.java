package Models;

public class EntryGate {
    TicketIssuer ticketIssuer;

    public EntryGate(TicketIssuer ticketIssuer){
        this.ticketIssuer = ticketIssuer;
    }

    public TicketIssuer getTicketIssuer() {
        return ticketIssuer;
    }

    public void setTicketIssuer(TicketIssuer ticketIssuer) {
        this.ticketIssuer = ticketIssuer;
    }
}
