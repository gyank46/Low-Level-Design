package Models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    long parkingLotId;
    String address;
    int capacity;

    List<ParkingLotFloor> parkingLotFloors = new ArrayList<>();
    List<EntryGate> entryGates = new ArrayList<>();
    List<ExitGate> exitGates = new ArrayList<>();

    public long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public ParkingLot(int capacity,String address){
        this.capacity = capacity;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
