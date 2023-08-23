package Models;

public class ParkingSpot {
    ParkingSpotStatus parkingSpotStatus;
    long parkingSpotId;
    VehicleType vehicleType;

    public ParkingSpot(VehicleType vehicleType){
        this.parkingSpotStatus = ParkingSpotStatus.AVAILABLE;
        this.vehicleType = vehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public long getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(long parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }



}
