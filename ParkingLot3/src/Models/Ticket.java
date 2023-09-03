package Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {
    String id;

    ParkingLotFloor parkingLotFloor;
    ParkingLotSpot parkingLotSpot;

}
