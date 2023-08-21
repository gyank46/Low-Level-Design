package Models;

public class ElectricPanel implements Payee{
    PaymentMode paymentMode;
    @Override
    public void makePayment(double amount) {
        paymentMode.makePayment(amount);
    }

    public void chargeVehicle(){

    }
}
