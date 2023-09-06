package Models;

import Services.TicketService;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket {
    String id;
    String parkingLotId;
    Long parkingLotFloorNumber;
    Long parkingLotSpotNumber;
    Long entryTime;

    public Ticket(String parkingLotId,Long parkingLotFloorNumber,Long parkingLotSpotNumber){
        this.id = parkingLotId+"_"+parkingLotFloorNumber+"_"+parkingLotSpotNumber;
        this.parkingLotFloorNumber = parkingLotFloorNumber;
        this.parkingLotSpotNumber = parkingLotSpotNumber;
        this.entryTime = new Date().getTime();
    }

}
