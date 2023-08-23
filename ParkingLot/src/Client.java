import Controllers.ParkingLotController;
import Controllers.ParkingLotFloorController;
import Controllers.ParkingSpotController;
import Models.*;
import Services.*;
import Strategies.RandomParkingSpotAllocationStrategy;

public class Client {
    public static void main(String[] args) {
        ParkingLotController parkingLotController = new ParkingLotController(new ParkingLotService(),new EntryGateService(new RandomParkingSpotAllocationStrategy()),new ExitGateService());
        ParkingLotFloorController parkingLotFloorController = new ParkingLotFloorController(new ParkingLotFloorService());

        ParkingLot parkingLot = parkingLotController.createParkingLot(100,"Jehanabad");

        for(int i=0;i<3;i++){
            ParkingLotFloor parkingLotFloor = parkingLotController.addParkingLotFloorToParkingLot(parkingLot.getParkingLotId());
            for(VehicleType vehicleType:VehicleType.values()){
                for(int j=0;j<5;j++){
                    ParkingSpot parkingSpot = parkingLotFloorController.addParkingSpotToParkingLotFloor(vehicleType,parkingLotFloor.getParkingLotFloorId());
                    System.out.println("ParkingLotId: "+parkingLot.getParkingLotId()+ ", ParkingLotFloorId: "+parkingLotFloor.getParkingLotFloorId()+", ParkingSpotId: "+parkingSpot.getParkingSpotId()+", ParkingSpotType: "+ parkingSpot.getVehicleType());
                }
            }
        }

        Vehicle vehicle = new Vehicle("ABCD",VehicleType.SMALL);
        Ticket ticket = parkingLotController.parkVehicleToParkingLot(vehicle,parkingLot.getParkingLotId());
        System.out.println(ticket);
    }
}