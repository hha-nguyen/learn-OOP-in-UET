package Week_10;

public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 0;
    public static final int TYPE_WITHDRAW_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 3;
    private final int type;
    private final double amount;
    private final double initialBalance;
    private final double finalBalance;

    /**
     * 4-parameter constructor.
     * @param type type.
     * @param initialBalance initialBalance.
     * @param amount amount.
     * @param finalBalance finalBalance.
     */
    public Transaction(int type, double initialBalance, double amount, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Create method to get transaction with string type.
     * @param type type.
     * @return string.
     */
    private String getTransactionTypeString(int type) {
        switch (type) {
            case TYPE_DEPOSIT_CHECKING:
                return "Nạp tiền vãng lai";
            case TYPE_WITHDRAW_CHECKING:
                return "Rút tiền vãng lai";
            case TYPE_DEPOSIT_SAVINGS:
                return "Nạp tiền tiết kiệm";
            case TYPE_WITHDRAW_SAVINGS:
                return "Rút tiền tiết kiệm";
            default: return null;
        }
    }

    /**
     * Create method to get transaction summary.
     * @return transaction summary.
     */
    public String getTransactionSummary() {
        String resultString = String.format(
                "- Kiểu giao dịch: %s. "
                + "Số dư ban đầu: $%.2f. "
                + "Số tiền: $%.2f. "
                + "Số dư cuối: $%.2f.",
                getTransactionTypeString(type),
                initialBalance,
                amount,
                finalBalance
                );
        return resultString;
    }
}
