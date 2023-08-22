package Models;

import Interfaces.ParkingFeeCalculationStrategy;
import Interfaces.Payee;

public class ExitGate extends Gate{
    Payee payee;
    ParkingFeeCalculationStrategy parkingFeeCalculationStrategy;
//    ParkingSpotChangeObserver parkingSpotChangeObserver;
    void makePayment(Ticket ticket){
        double totalAmount = parkingFeeCalculationStrategy.calculateParkingFee(ticket);
        double amountToBePaid = totalAmount- ticket.amountPaid;
        payee.makePayment(amountToBePaid);
        ticket.parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
    }
}
