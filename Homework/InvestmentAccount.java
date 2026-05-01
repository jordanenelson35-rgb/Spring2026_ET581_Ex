public class InvestmentAccount extends Account {

    // constructor to initialize investment account.
    public InvestmentAccount(int id, double balance) {
        super(id, balance);
    }

    // this overrides the service fee for investment accounts.
    @Override
    public double calculateServiceFee() {
        return getBalance() * 0.03; // 3% fee for investment.
    }
}