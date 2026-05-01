public class Account {
    private int id; // this stores the account ID.
    private double balance; // this stores the account balance.

    // this constructor will initialize the account info.
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // getter for id so other classes can access it.
    public int getId() {
        return id;
    }

    // getter for balance so we can use it in calculations.
    public double getBalance() {
        return balance;
    }

    // this method will calculate service fee (base version, will be overridden).
    public double calculateServiceFee() {
        return 0.0; // default, child classes will change this.
    }
}