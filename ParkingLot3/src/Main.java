import Controllers.ParkingLotController;
import Models.*;
import Repositories.ParkingLotFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingLotSpotRepository;
import Repositories.TicketRepository;
import Services.ParkingLotFloorService;
import Services.ParkingLotService;
import Services.ParkingLotSpotService;
import Services.TicketService;
import Strategies.FirstAvailableSpotStrategy;

public class Main {
    public static void main(String[] args) {

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLotFloorRepository parkingLotFloorRepository = new ParkingLotFloorRepository();
        ParkingLotSpotRepository parkingLotSpotRepository = new ParkingLotSpotRepository();
        TicketRepository ticketRepository =  new TicketRepository();

        TicketService ticketService = new TicketService(ticketRepository);
        ParkingLotSpotService parkingLotSpotService = new ParkingLotSpotService(parkingLotSpotRepository);
        ParkingLotFloorService parkingLotFloorService = new ParkingLotFloorService(parkingLotSpotService,parkingLotFloorRepository);
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotFloorService,parkingLotRepository,new FirstAvailableSpotStrategy(),ticketService,parkingLotSpotService);

        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);

        ParkingLot parkingLot = parkingLotController.createParkingLot("PR1234","Jehanabad",2L,3L);

        Vehicle vehicle = new Vehicle(VehicleType.CAR,"123",VehicleColor.RED);
        Vehicle vehicle1 = new Vehicle(VehicleType.CAR,"245",VehicleColor.BLUE);
        Vehicle vehicle2 = new Vehicle(VehicleType.CAR,"567",VehicleColor.BLUE);

        parkingLotController.parkVehicleToParkingLot(vehicle,parkingLot.getParkingLotId());
        parkingLotController.parkVehicleToParkingLot(vehicle1,parkingLot.getParkingLotId());
        parkingLotController.parkVehicleToParkingLot(vehicle2,parkingLot.getParkingLotId());

        parkingLotController.unParkVehicleWithTicketId("PR1234_1_3");
        parkingLotController.parkVehicleToParkingLot(vehicle2,parkingLot.getParkingLotId());

    }
}