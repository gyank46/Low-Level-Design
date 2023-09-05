package Repositories;

import Models.ParkingLotFloor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class ParkingLotFloorRepository {

    HashMap<Long, ParkingLotFloor> parkingLotFloorRepository = new HashMap<>();

    public ParkingLotFloor saveParkingLotFloor(ParkingLotFloor parkingLotFloor){
        this.parkingLotFloorRepository.put(parkingLotFloor.getFloorNumber(),parkingLotFloor);
        return parkingLotFloor;
    }

    public ParkingLotFloor getParkingLotFloorById(Long floorNumber) {
        return this.parkingLotFloorRepository.get(floorNumber);
    }

    public void removeParkingLotFloorById(Long floorNumber) {
        this.parkingLotFloorRepository.remove(floorNumber);
    }
}
