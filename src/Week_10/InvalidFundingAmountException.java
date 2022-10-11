package Week_10;

public class InvalidFundingAmountException extends BankException {
    /**
     * Constructor.
     * @param amount amount.
     */

    public InvalidFundingAmountException(double amount) {
        super(String.format("Số tiền không hợp lệ: $%.2f", amount));
    }
}
