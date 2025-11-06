package BankAccount;

public class Main {
    public static void main(String[] args) {
        //Object of BankAccount
        BankAccount bank = new BankAccount(100, 1);

        //Setter for balance and accountNumber
        bank.setBalance(-1);
        bank.setAccountNumber(1393444839);

        //Getter for retrieving the info
        System.out.println("The bank balance is: $" + bank.getBalance());
        System.out.println("The account number is: " + bank.getAccountNumber());

    }
}
