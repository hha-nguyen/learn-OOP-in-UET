package Week_10;

public class SavingsAccount extends Account {
    /**
     * Constructor.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Create method to override withdraw.
     * @param amount amount.
     */
    @Override
    public void withdraw(double amount) {

        try {
            doWithdrawing(amount);
            addTransaction(new Transaction(
                    Transaction.TYPE_WITHDRAW_SAVINGS, balance + amount,
                    amount, balance)
            );
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Create method to override deposit.
     * @param amount amount.
     */
    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            addTransaction(new Transaction(
                    Transaction.TYPE_DEPOSIT_SAVINGS, balance - amount,
                    amount, balance)
            );
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
