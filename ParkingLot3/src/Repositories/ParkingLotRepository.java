package Repositories;

import Models.ParkingLot;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class ParkingLotRepository {

    HashMap<String, ParkingLot> parkingLotRepository = new HashMap<>();

    public ParkingLot saveParkingLot(ParkingLot parkingLot){
        parkingLotRepository.put(parkingLot.getParkingLotId(),parkingLot);
        return parkingLot;
    }

    public ParkingLot getParkingLotById(String parkingLotId) {
        return parkingLotRepository.get(parkingLotId);
    }

    public void removeParkingLotById(String parkingLotId) {
        this.parkingLotRepository.remove(parkingLotId);
    }
}
