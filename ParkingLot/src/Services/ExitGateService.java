package Services;

import Models.Ticket;
import Models.Vehicle;
import Strategies.ParkingFeeCalculationStrategy;

import java.util.Objects;

public class ExitGateService {

    ParkingFeeCalculationStrategy parkingFeeCalculationStrategy;
    PaymentService paymentService;

    public ExitGateService(ParkingFeeCalculationStrategy parkingFeeCalculationStrategy){
        this.parkingFeeCalculationStrategy = parkingFeeCalculationStrategy;
    }
    public void unParkVehicle(Vehicle vehicle){

    }

    public void unParkVehicle(Vehicle vehicle, Ticket ticket) {
        if(Objects.equals(vehicle.getVehicleNumber(), ticket.getVehicleNumber())){
            double totalAmount = parkingFeeCalculationStrategy.calculateFee(ticket);
            paymentService.makePayment(totalAmount);
        }
    }
}
