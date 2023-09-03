package Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class ParkingLot {
    String parkingLotId;
    String address;
    Long noOfFloors;
    Long noOfSpotsPerFloor;
    List<ParkingLotFloor> parkingLotFloors = new ArrayList<>();

}
