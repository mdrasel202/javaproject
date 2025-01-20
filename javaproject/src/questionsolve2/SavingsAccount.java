package questionsolve2;

public class SavingsAccount extends BankAccount{
    private double interest;

    public SavingsAccount(int accountNumber, double balance, double interest){
        super(accountNumber, balance, interest);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double interestAmount(){
        return getBalance()* interest/100;
    }

}
