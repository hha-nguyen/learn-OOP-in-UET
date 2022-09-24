package src.Week_4;

public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";



    /**
     * constructor.
     * @param operation name of transaction.
     * @param amount amount of transaction.
     * @param balance the remaining balance.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * create getter method for operation.
     * @return name of transaction.
    */
    public String getOperation() {
        return operation;
    }

    /**
     * create setter method for operation.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * create getter method for amount.
     * @return amount of transaction.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * create setter method for amount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * create getter method for balance.
     * @return the remaining balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * create setter method for balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
