package Models;

public class ParkingSpot {
    ParkingSpotStatus parkingSpotStatus;
    ParkingSpotSize parkingSpotSize;
    String parkingSpotId;

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingSpotSize getParkingSpotSize() {
        return parkingSpotSize;
    }

    public void setParkingSpotSize(ParkingSpotSize parkingSpotSize) {
        this.parkingSpotSize = parkingSpotSize;
    }
}
