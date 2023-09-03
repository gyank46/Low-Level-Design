import Controllers.ParkingLotController;
import Models.ParkingLot;
import Models.ParkingLotFloor;
import Models.ParkingLotSpot;
import Repositories.ParkingLotFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingLotSpotRepository;
import Services.ParkingLotFloorService;
import Services.ParkingLotService;
import Services.ParkingLotSpotService;

public class Main {
    public static void main(String[] args) {

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLotFloorRepository parkingLotFloorRepository = new ParkingLotFloorRepository();
        ParkingLotSpotRepository parkingLotSpotRepository = new ParkingLotSpotRepository();

        ParkingLotSpotService parkingLotSpotService = new ParkingLotSpotService(parkingLotSpotRepository);
        ParkingLotFloorService parkingLotFloorService = new ParkingLotFloorService(parkingLotSpotService,parkingLotFloorRepository);
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotFloorService,parkingLotRepository);

        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);

        ParkingLot parkingLot = parkingLotController.createParkingLot("PR1234_2_5","Jehanabad",2L,5L);
        for(ParkingLot parkingLot1:parkingLotRepository.getParkingLotRepository().values()){
            System.out.println(parkingLot1);
        }

        for(ParkingLotFloor parkingLotFloor1:parkingLotFloorRepository.getParkingLotFloorRepository().values()){
            System.out.println(parkingLotFloor1);
        }

        for (ParkingLotSpot parkingLotSpot1:parkingLotSpotRepository.getParkingLotSpotRepository().values()){
            System.out.println(parkingLotSpot1);
        }

    }
}