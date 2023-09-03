package Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingLotSpot {
    Long parkingSpotNumber;
    ParkingSpotStatus parkingSpotStatus;
    ParkingSpotType parkingSpotType;
}
