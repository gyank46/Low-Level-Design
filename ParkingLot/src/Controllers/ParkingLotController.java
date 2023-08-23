package Controllers;

import Models.ParkingLot;
import Models.ParkingLotFloor;
import Models.Ticket;
import Models.Vehicle;
import Repositories.ParkingLotFloorRepository;
import Repositories.ParkingLotRepository;
import Services.EntryGateService;
import Services.ExitGateService;
import Services.ParkingLotService;

public class ParkingLotController {
    ParkingLotService parkingLotService;
    EntryGateService entryGateService;
    ExitGateService exitGateService;
    public ParkingLotController(ParkingLotService parkingLotService, EntryGateService entryGateService, ExitGateService exitGateService){
        this.parkingLotService = parkingLotService;
        this.entryGateService = entryGateService;
        this.exitGateService = exitGateService;
    }
    public ParkingLot createParkingLot(int capacity, String address){
        return parkingLotService.createParkingLot(capacity,address);
    }

    public void deleteParkingLot(long parkingLotId){
        parkingLotService.deleteParkingLot(parkingLotId);
    }

    public ParkingLotFloor addParkingLotFloorToParkingLot(long parkingLotId){
        return parkingLotService.addParkingLotFloorToParkingLot(parkingLotId);
    }

    public void removeParkingLotFloorFromParkingLot(long parkingLotId,long parkingLotFloorId){
        parkingLotService.removeParkingLotFloorFromParkingLot(parkingLotId,parkingLotFloorId);
    }

    public Ticket parkVehicleToParkingLot(Vehicle vehicle,long parkingLotId){
        return entryGateService.parkVehicle(vehicle,parkingLotId);
    }

}
