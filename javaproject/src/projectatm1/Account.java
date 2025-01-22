package projectatm1;

public class Account {
    private String name;
    private double withdraw;
    private double deposit;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getBalance() {
        return balance;
    }

    public  void displayInformation(){
        System.out.println("Your name : "+name);
        System.out.println("Your Balance : "+ balance);
    }

    public void depositMoney(double amount){
        this.balance = balance +amount;
    }

    public void withdrawMoney(double amount){
        this.balance = balance-amount;
    }
}
