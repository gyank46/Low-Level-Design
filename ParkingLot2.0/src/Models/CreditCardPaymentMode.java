package Models;

import Interfaces.PaymentMode;

public class CreditCardPaymentMode implements PaymentMode {
    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment of "+amount+" via Credit card!!!");
    }
}
