package questionsolve2;

public class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance, double interest){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposite(double amount){
       if(amount > 0){
           this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount<0){
            this.balance -= amount;
       }
    }
}
