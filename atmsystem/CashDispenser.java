package atmsystem;

public class CashDispenser {
    private int cashAvailable;

    public CashDispenser(int cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public synchronized void dispenseCash(int amount) {
        if (amount > cashAvailable) {
            throw new IllegalArgumentException("Insufficient cash available in the ATM.");
        }
        cashAvailable -= amount;
        System.out.println("Dispensing " + amount + " cash of money.");
    }
}
