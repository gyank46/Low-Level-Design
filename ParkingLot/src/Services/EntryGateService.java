package Services;

import Models.*;
import Strategies.ParkingSpotAllocationStrategy;

public class EntryGateService {

    ParkingSpotAllocationStrategy parkingSpotAllocationStrategy;
    public Ticket parkVehicle(Vehicle vehicle,long parkingLotId){
        ParkingSpot parkingSpot = parkingSpotAllocationStrategy.allocateParkingSpot(vehicle.getVehicleType(),parkingLotId);
        new ParkingSpotService().updateParkingSpotStatus(parkingSpot.getParkingSpotId(), ParkingSpotStatus.OCCUPIED);
        return new TicketService().generateTicket(vehicle,parkingSpot);
    }

    public EntryGateService(ParkingSpotAllocationStrategy parkingSpotAllocationStrategy){
        this.parkingSpotAllocationStrategy = parkingSpotAllocationStrategy;
    }
}
