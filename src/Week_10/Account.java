package Week_10;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected java.util.List<Transaction> transactionList = new java.util.ArrayList<>();

    /**
     * Constructor.
     */
    public Account() {}

    /**
     * Constructor.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Create getter for account number.
     * @return account number.
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Create getter for balance.
     * @return balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Create abstract withdraw method.
     * @param amount amount.
     */
    public abstract void withdraw(double amount);

    /**
     * Create abstract deposit method.
     * @param amount amount.
     */
    public abstract void deposit(double amount);

    /**
     * Create doWithdraw method.
     * @param amount amount.
     * @throws BankException BankException.
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else {
            balance -= amount;
        }
    }

    /**
     * Create doDepositing method.
     * @param amount amount.
     * @throws BankException BankException.
     */
    public void doDepositing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            balance += amount;
        }
    }

    /**
     * Create method to get history of transaction.
     * @return history.
     */
    public String getTransactionHistory() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lịch sử giao dịch của tài khoản ")
                .append(this.accountNumber)
                .append(":\n");
        for (Transaction transaction : transactionList) {
            stringBuilder.append(transaction.getTransactionSummary()).append("\n");
        }
        return stringBuilder.toString();
    }

    /**
     * Create method to add transaction.
     * @param transaction transaction.
     */
    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    @Override
    public boolean equals(Object object) {
        Account other = (Account) object;
        if (this.accountNumber == other.accountNumber) {
            return true;
        }
        return false;
    }
}

