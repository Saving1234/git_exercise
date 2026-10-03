package level02.normal;

public class Account {
    private String accountNumber;
    private int balance;

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
}
