public class MainHW10 {

    // this will calculate total service fee of all accounts.
    public static double calculateTotal(Account[] accounts) {
        double total = 0;
        for (int i = 0; i < accounts.length; i++) {
            total += accounts[i].calculateServiceFee();
        }
        return total;
    }

    // this will find the account ID with the highest balance.
    public static int findMaxAccountId(Account[] accounts) {
        double max = accounts[0].getBalance();
        int id = accounts[0].getId();

        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].getBalance() > max) {
                max = accounts[i].getBalance();
                id = accounts[i].getId();
            }
        }
        return id;
    }

    // this will find the account ID with the lowest balance.
    public static int findMinAccountId(Account[] accounts) {
        double min = accounts[0].getBalance();
        int id = accounts[0].getId();

        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].getBalance() < min) {
                min = accounts[i].getBalance();
                id = accounts[i].getId();
            }
        }
        return id;
    }

    // this will calculate the average service fee.
    public static double calculateAverage(Account[] accounts) {
        double total = calculateTotal(accounts);
        return total / accounts.length;
    }

    // this will count how many accounts of each type exist.
    public static int countAccountTypes(Account[] accounts, String type) {
        int count = 0;

        for (int i = 0; i < accounts.length; i++) {

            // checking type using instanceof.
            if (type.equals("Checking") && accounts[i] instanceof CheckingAccount) {
                count++;
            } else if (type.equals("Saving") && accounts[i] instanceof SavingAccount) {
                count++;
            } else if (type.equals("Investment") && accounts[i] instanceof InvestmentAccount) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // creating array of accounts using upcasting.
        Account[] accounts = new Account[6];

        accounts[0] = new CheckingAccount(101, 5000);
        accounts[1] = new SavingAccount(102, 12000);
        accounts[2] = new InvestmentAccount(103, 7000);

        accounts[3] = new CheckingAccount(104, 3000);
        accounts[4] = new SavingAccount(105, 8000);
        accounts[5] = new InvestmentAccount(106, 15000);

        // calling required methods.
        double total = calculateTotal(accounts);
        int maxId = findMaxAccountId(accounts);
        int minId = findMinAccountId(accounts);
        double average = calculateAverage(accounts);

        // printing results.
        System.out.println("Total Service Fee: " + total);
        System.out.println("Max Account ID: " + maxId);
        System.out.println("Min Account ID: " + minId);
        System.out.println("Average Service Fee: " + average);

        // counting each account type.
        System.out.println("Checking Accounts: " + countAccountTypes(accounts, "Checking"));
        System.out.println("Saving Accounts: " + countAccountTypes(accounts, "Saving"));
        System.out.println("Investment Accounts: " + countAccountTypes(accounts, "Investment"));
    }
}