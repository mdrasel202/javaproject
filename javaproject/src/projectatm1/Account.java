package projectatm1;

public class Account {
    private String name;
    private double withdraw;
    private double deposit;
    private double checkBalance;

    public Account(String name, double withdraw, double deposit, double checkBalance) {
        this.name = name;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.checkBalance = checkBalance;
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

    public double getCheckBalance() {
        return checkBalance;
    }

    public  void displayInformation(){
        System.out.println("Your name : "+name);
        System.out.println("Your Balance : "+checkBalance);
    }
}
