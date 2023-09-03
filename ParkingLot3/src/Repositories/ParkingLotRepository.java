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
}
