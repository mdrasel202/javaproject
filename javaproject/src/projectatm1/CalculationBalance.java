package projectatm1;

public class CalculationBalance {
    public static void main(String[] args) {
        Account bakorkhan = new Account("himu", 500);
       // bakorkhan.getBalance();
        System.out.println("Balace : "+bakorkhan.getBalance());

        bakorkhan.depositMoney(3000);
        System.out.println("Deposit : "+bakorkhan.getBalance());

        bakorkhan.withdrawMoney(2000);
        System.out.println("Withdraw : "+bakorkhan.getBalance());
    }
}
