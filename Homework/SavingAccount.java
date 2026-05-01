public class SavingAccount extends Account {

    // constructor that calls parent constructor.
    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    // this overrides the service fee for saving accounts.
    @Override
    public double calculateServiceFee() {
        return getBalance() * 0.01; // 1% fee for saving.
    }
}