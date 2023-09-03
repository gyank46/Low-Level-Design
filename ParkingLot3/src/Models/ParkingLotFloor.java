package Models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingLotFloor {
    Long floorNumber;
    List<ParkingLotSpot> parkingLotSpots = new ArrayList<>();
}
