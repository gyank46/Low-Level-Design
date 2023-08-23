package Models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotFloor {
    List<ParkingSpot> parkingSpots = new ArrayList<>();
    long parkingLotFloorId;

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public long getParkingLotFloorId() {
        return parkingLotFloorId;
    }

    public void setParkingLotFloorId(long parkingLotFloorId) {
        this.parkingLotFloorId = parkingLotFloorId;
    }
}
