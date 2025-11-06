package BankAccount;

public class BankAccount {

    //Attributes
    private double balance;
    private int accountNumber;

    //Constructor
    BankAccount(double balance, int accountNumber){
        setBalance(balance);
        this.accountNumber = accountNumber;
    }

    //Getters & Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative. Balance unchanged.");
        } else {
            this.balance = balance;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

}
