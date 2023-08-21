package Models;
public class ExitGate extends Gate{
    Payee payee;
    ParkingFeeCalculationStrategy parkingFeeCalculationStrategy;
    void makePayment(Ticket ticket){
        double totalAmount = parkingFeeCalculationStrategy.calculateParkingFee(ticket);
        double amountToBePaid = totalAmount- ticket.amountPaid;
        payee.makePayment(amountToBePaid);
    }
}
