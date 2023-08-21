package Models;

public class ParkingAttendant implements Payee{
    PaymentMode paymentMode;
    @Override
    public void makePayment(double amount) {
        paymentMode.makePayment(amount);
    }
}
