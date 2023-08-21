package Models;

public class ExitPanel implements Payee{
    PaymentMode paymentMode;
    @Override
    public void makePayment(double amount) {
        paymentMode.makePayment(amount);
    }
}
