//package project.atm;
//
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
//public class Account {
//    private int customerNumber;
//    private int pinNumber;
//    private double checkingBlance = 0;
//    private double savingBlance = 0;
//
//    Scanner input = new Scanner(System.in);
//    DecimalFormat moneyFormat = new DecimalFormat("'&'###,##0.00");
//
//    public int getCustomerNumber() {
//        return customerNumber;
//    }
//
//    public void setCustomerNumber(int customerNumber) {
//        this.customerNumber = customerNumber;
//    }
//
//    public int getPinNumber() {
//        return pinNumber;
//    }
//
//    public void setPinNumber(int pinNumber) {
//        this.pinNumber = pinNumber;
//    }
//
//    public double getCheckingBlance() {
//        return checkingBlance;
//    }
//    public double getSavingBlance() {
//        return savingBlance;
//    }
//
//
////    public void checkingWithdraw(double amount){
////        checkingBlance = (checkingBlance - amount);
////    }
////    public void savingWidthdraw(double amount){
////        savingBlance = (savingBlance - amount);
////    }
////    public void checkingDeposit(double amount){
////        checkingBlance = (checkingBlance + amount);
////    }
////    public void savingDeposite(double amount){
////        savingBlance = (savingBlance + amount);
////    }
//
//    public void checkingWithdrawinput(){
//        System.out.println("Checking Account balcce"+moneyFormat.format(checkingBlance));
//        System.out.println("Amount you want to withdraw from checking account : ");
//        double amout = input.nextDouble();
//
//        if(checkingBlance - amout >= 0){
//           // checkingWithdraw(amout);
//            System.out.println("New checking account blance : "+moneyFormat.format(checkingBlance));
//        }else {
//            System.out.println("Not enough money to withdrow");
//        }
//
//    }
//
//    public void savingWithdrawinput(){
//        System.out.println("Saving account blance : "+moneyFormat.format(savingBlance));
//        System.out.println(("Amount you want to withdraw from saving withdrow"));
//        double amount = input.nextDouble();
//
//        if(savingBlance - amount >= 0){
//           // savingWidthdraw(amount);
//            System.out.println("New saving account blance : "+moneyFormat.format(savingBlance));
//        }else{
//            System.out.println("Not enough money to withdrow");
//        }
//    }
//
//    public void checkingDepositinput(){
//        System.out.println("Checking deposite acount blance : "+moneyFormat.format(checkingBlance));
//        System.out.println("Amount you want to deposite from checking account");
//        double amount = input.nextDouble();
//
//        if(checkingBlance - amount >=0){
//            //checkingDeposit(amount);
//            System.out.println("New checking account blance : "+moneyFormat.format(checkingBlance));
//        }else {
//            System.out.println("No money to deposid");
//        }
//    }
//
//    public void savingDepositeinput(){
//        System.out.println("New saving deposite account blance :"+moneyFormat.format(savingBlance));
//        System.out.println("Amount you wnat to deposite from saving account");
//        double amount = input.nextDouble();
//
//        if(savingBlance + amount >=0){
//            //savingDeposite(amount);
//            System.out.println("New saving saving deposite blance : "+moneyFormat.format(savingBlance));
//        }else{
//            System.out.println("No saving deposite blance");
//        }
//    }
//}
