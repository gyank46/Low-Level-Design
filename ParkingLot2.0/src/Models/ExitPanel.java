package Models;

import Interfaces.Payee;
import Interfaces.PaymentMode;

public class ExitPanel implements Payee {
    PaymentMode paymentMode;
    @Override
    public void makePayment(double amount) {
        paymentMode.makePayment(amount);
    }
}
