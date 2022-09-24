package src.Week_4;

public class Account {
    private double balance;
    private java.util.ArrayList<Transaction> transitionList
            = new java.util.ArrayList<Transaction>();

    /**
     * Create deposit method.
     * @param amount amount of money that user want to deposit.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            Transaction newDeposit = new Transaction("Nap tien", amount, balance);
            // Add new depositing transaction to the transaction list.
            transitionList.add(newDeposit);
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * Create withdraw method.
     * @param amount amount of money that user want to withdraw.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            Transaction newWithdraw = new Transaction("Rut tien", amount, balance);
            // Add new withdrawing transaction to the transaction list.
            transitionList.add(newWithdraw);
        }
    }

    /**
     * Create method to add transaction to transaction list.
     * @param amount amount of money that user want to transaction.
     * @param operation name of operation.
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
        } else if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }

    /**
     * Print history of transactions.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            System.out.print("Giao dich " + (i + 1) + ": "
                            + transitionList.get(i).getOperation() + " $");
            System.out.printf("%.2f", transitionList.get(i).getAmount());
            System.out.print(". So du luc nay: $");
            System.out.printf("%.2f", transitionList.get(i).getBalance());
            System.out.println(".");
        }
    }

    /**
     * Create main method to test.
     * @param args nothing.
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(-10, "deposit");
        acc.addTransaction(2000.255, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}
