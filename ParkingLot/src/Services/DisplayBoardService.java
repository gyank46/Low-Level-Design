package Services;

import Models.ParkingSpot;
import Models.ParkingSpotStatus;
import Models.Vehicle;
import Models.VehicleType;
import Repositories.ParkingLotFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingSpotRepository;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoardService {

    public void displayStatusForParkingLot(long parkingLotId) {
        System.out.println("Parking Lot Status for Parking Lot: "+parkingLotId);
        for (long parkingLotFloorId : ParkingLotRepository.getParkingLotFloorsForParkingLot(parkingLotId)) {
            displayStatusForParkingLotFloor(parkingLotFloorId);
        }

    }

    public void displayStatusForParkingLotFloor(long parkingLotFloorId) {
        HashMap<VehicleType, Integer> vehicleTypeAvailableCountMap = new HashMap<>();
        for (long parkingSpotId : ParkingLotFloorRepository.getParkingSpotsForParkingFloor(parkingLotFloorId)) {
            ParkingSpot parkingSpot = ParkingSpotRepository.getParkingSpot(parkingSpotId);
            if (parkingSpot.getParkingSpotStatus() == ParkingSpotStatus.AVAILABLE) {
                if (!vehicleTypeAvailableCountMap.containsKey(parkingSpot.getVehicleType())) {
                    vehicleTypeAvailableCountMap.put(parkingSpot.getVehicleType(), 0);
                }
                int currentCount = vehicleTypeAvailableCountMap.get(parkingSpot.getVehicleType());
                vehicleTypeAvailableCountMap.put(parkingSpot.getVehicleType(), currentCount + 1);
            }
        }
        System.out.println("Parking Lot Status for parking Lot Floor: "+ parkingLotFloorId);
        for (Map.Entry<VehicleType, Integer> entry : vehicleTypeAvailableCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}

