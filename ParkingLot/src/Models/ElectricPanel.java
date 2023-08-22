package Models;

import Interfaces.Payee;
import Interfaces.PaymentMode;

public class ElectricPanel implements Payee {
    PaymentMode paymentMode;
    @Override
    public void makePayment(double amount) {
        paymentMode.makePayment(amount);
    }

    public void chargeVehicle(){
        System.out.println("Charging vehicle via electric panel!!");
    }
}
