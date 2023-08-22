package Models;

public class ElectricParkingSpots extends ParkingSpot {
    ElectricPanel electricPanel;

    public ElectricParkingSpots(ParkingSpotStatus parkingSpotStatus, ParkingSpotSize parkingSpotSize) {
        super(parkingSpotStatus, parkingSpotSize);
    }
}
