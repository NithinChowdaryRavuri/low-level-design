package hotelmanagement.payment;

public class CreditCardPayment implements Payment {
    @Override
    public boolean processPayment(double amount) {
        // Process Credit Card Payment
        // ...
        return true;
    }
}
