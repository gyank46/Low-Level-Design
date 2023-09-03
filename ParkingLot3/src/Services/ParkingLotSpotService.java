package Services;

import Models.ParkingLotSpot;
import Models.ParkingSpotStatus;
import Models.ParkingSpotType;
import Repositories.ParkingLotRepository;
import Repositories.ParkingLotSpotRepository;

public class ParkingLotSpotService {

    private ParkingLotSpotRepository parkingLotSpotRepository;

    public ParkingLotSpotService(ParkingLotSpotRepository parkingLotSpotRepository){
        this.parkingLotSpotRepository = parkingLotSpotRepository;
    }
    ParkingLotSpot createParkingLotSpot(Long parkingLotSpotId,ParkingSpotType parkingSpotType){
        ParkingLotSpot parkingLotSpot = new ParkingLotSpot();
        parkingLotSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
        parkingLotSpot.setParkingSpotNumber(parkingLotSpotId);
        parkingLotSpot.setParkingSpotType(parkingSpotType);
        return parkingLotSpotRepository.saveParkingLotSpot(parkingLotSpot);
    }
}
