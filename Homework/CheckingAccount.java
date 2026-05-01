public class CheckingAccount extends Account {

    // constructor that passes values to parent class.
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    // this overrides the service fee for checking accounts.
    @Override
    public double calculateServiceFee() {
        return getBalance() * 0.02; // 2% fee for checking.
    }
}