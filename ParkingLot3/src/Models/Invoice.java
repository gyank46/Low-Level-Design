package Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Invoice {
    Ticket ticket;
    Long amount;
}
