package Week_10;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private final List<Account> accountList = new ArrayList<>();

    /**
     * Constructor.
     */
    public Customer() {}

    /**
     * 2-parameter constructor.
     * @param idNumber idNumber.
     * @param fullName fullName.
     */
    public Customer(long idNumber, String fullName) {
        this();
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * Create method to get customer info.
     * @return customer info.
     */
    public String getCustomerInfo() {
        return String.format("Số CMND: %d. Họ tên: %s.", idNumber, fullName);
    }

    /**
     * Create method to add account.
     * @param account account.
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Create method to remove account.
     * @param account account.
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * Create getter method for accountList.
     * @return accountList.
     */
    public List<Account> getAccountList() {
        return accountList;
    }

    /**
     * Create setter method for idNumber.
     * @param idNumber idNumber.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Create getter method for idNumber.
     * @return idNumber.
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * Create setter method for fullName.
     * @param fullName fullName.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Create getter method for fullName.
     * @return fullname.
     */
    public String getFullName() {
        return fullName;
    }
}
