package Services;

import Models.EntryGate;
import Models.ExitGate;
import Models.ParkingLot;
import Models.ParkingLotFloor;
import Repositories.ParkingLotRepository;

public class ParkingLotService {
    public ParkingLot createParkingLot(int capacity, String address){
        ParkingLot parkingLot = new ParkingLot(capacity,address);
        ParkingLotRepository.addParkingLot(parkingLot);
        return parkingLot;
    }

    public void deleteParkingLot(long parkingLotId){
        for(long parkingLotFloorId: ParkingLotRepository.getParkingLotFloorsForParkingLot(parkingLotId)){
            new ParkingLotFloorService().removeParkingLotFloor(parkingLotFloorId);
        }
        ParkingLotRepository.removeParkingLot(parkingLotId);
    }

    public ParkingLotFloor addParkingLotFloorToParkingLot(long parkingLotId) {
        ParkingLotFloor parkingLotFloor = new ParkingLotFloorService().createParkingLotFloor();
        ParkingLotRepository.addParkingLotFloorToParkingLot(parkingLotId,parkingLotFloor.getParkingLotFloorId());
        return parkingLotFloor;
    }

    public void removeParkingLotFloorFromParkingLot(long parkingLotId,long parkingLotFloorId){
        new ParkingLotFloorService().removeParkingLotFloor(parkingLotFloorId);
        ParkingLotRepository.removeParkingLotFloorFromParkingLot(parkingLotId,parkingLotFloorId);
    }
}
