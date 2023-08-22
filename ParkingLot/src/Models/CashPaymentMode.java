package Models;

import Interfaces.PaymentMode;

public class CashPaymentMode implements PaymentMode {
    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment of "+amount +" via Cash!!");
    }
}
