package Controllers;

import Models.*;
import Services.DisplayBoardService;
import Services.EntryGateService;
import Services.ExitGateService;
import Services.ParkingLotService;

public class ParkingLotController {
    ParkingLotService parkingLotService;
    EntryGateService entryGateService;
    ExitGateService exitGateService;
    DisplayBoardService displayBoardService;
    public ParkingLotController(ParkingLotService parkingLotService, EntryGateService entryGateService, ExitGateService exitGateService, DisplayBoardService displayBoardService){
        this.parkingLotService = parkingLotService;
        this.entryGateService = entryGateService;
        this.exitGateService = exitGateService;
        this.displayBoardService = displayBoardService;
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

    public void unParkVehicleFromParkingLot(Vehicle vehicle, Ticket ticket){
        exitGateService.unParkVehicle(vehicle,ticket);
    }

    public void displayParkingLotStatus(long parkingLotId){
        displayBoardService.displayStatusForParkingLot(parkingLotId);
    }

}
