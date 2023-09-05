package Repositories;

import Models.ParkingLotSpot;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;


@Getter
@Setter
@ToString
public class ParkingLotSpotRepository {
    public HashMap<Long, ParkingLotSpot> parkingLotSpotRepository = new HashMap<>();

    public ParkingLotSpot saveParkingLotSpot(ParkingLotSpot parkingLotSpot){
        this.parkingLotSpotRepository.put(parkingLotSpot.getParkingSpotNumber(),parkingLotSpot);
        return parkingLotSpot;
    }

    public void removeParkingLotSpotById(Long parkingSpotNumber) {
        this.parkingLotSpotRepository.remove(parkingSpotNumber);
    }
}
