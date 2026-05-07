package madala.learning.oop.masterclassone.model;

/**
 * Represents a bank account with basic operations like deposit and withdrawal.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
       
    }

    /**
     * Constructs a new BankAccount with the specified details.
     * @param accountNumber the account number
     * @param balance the initial balance
     * @param customerName the customer's name
     * @param email the customer's email
     * @param phoneNumber the customer's phone number
     */
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Deposits the specified amount into the account.
     * @param amount the amount to deposit (must be positive)
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        }
    }

    /**
     * Withdraws the specified amount from the account if sufficient funds are available.
     * @param amount the amount to withdraw (must be positive and not exceed balance)
     */
    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    // Getters
    /**
     * @return the account number
     */
    public String getAccountNumber() { return accountNumber; }

    /**
     * @return the current balance
     */
    public double getBalance() { return balance; }

    /**
     * @return the customer's name
     */
    public String getCustomerName() { return customerName; }

    /**
     * @return the customer's email
     */
    public String getEmail() { return email; }

    /**
     * @return the customer's phone number
     */
    public String getPhoneNumber() { return phoneNumber; }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
