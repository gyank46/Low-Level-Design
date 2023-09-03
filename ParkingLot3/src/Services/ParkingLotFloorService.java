package Services;

import Models.ParkingLotFloor;
import Models.ParkingLotSpot;
import Models.ParkingSpotStatus;
import Models.ParkingSpotType;
import Repositories.ParkingLotFloorRepository;

public class ParkingLotFloorService {
    ParkingLotSpotService parkingLotSpotService;
    ParkingLotFloorRepository parkingLotFloorRepository;

    public ParkingLotFloorService(ParkingLotSpotService parkingLotSpotService,ParkingLotFloorRepository parkingLotFloorRepository){
        this.parkingLotSpotService = parkingLotSpotService;
        this.parkingLotFloorRepository = parkingLotFloorRepository;
    }
    public ParkingLotFloor createParkingLotFloor(Long parkingLotFloorId, Long noOfSpotsPerFloor) {
        ParkingLotFloor parkingLotFloor = new ParkingLotFloor();
        parkingLotFloor.setFloorNumber(parkingLotFloorId);

        Long parkingLotSpotStartId = (parkingLotFloorId-1)*noOfSpotsPerFloor +1;
        for(int i=0;i<noOfSpotsPerFloor;i++){
            Long parkingLotSpotId = parkingLotSpotStartId+i;
            ParkingSpotType parkingSpotType;
            if(i==0){
                parkingSpotType = ParkingSpotType.TRUCK;
            }else if(i==1 || i == 2){
                parkingSpotType = ParkingSpotType.CAR;
            }else{
                parkingSpotType = ParkingSpotType.BIKE;
            }
            ParkingLotSpot parkingLotSpot = parkingLotSpotService.createParkingLotSpot(parkingLotSpotId,parkingSpotType);
            parkingLotFloor.getParkingLotSpots().add(parkingLotSpot);
        }
        return parkingLotFloorRepository.saveParkingLotFloor(parkingLotFloor);
    }
}
