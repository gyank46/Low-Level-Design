package Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ParkingSpotFinderResult {
    ParkingLotFloor parkingLotFloor;
    ParkingLotSpot parkingLotSpot;
}
