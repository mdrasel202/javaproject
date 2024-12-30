package classwork;

import java.util.Scanner;

public class Decimalss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number :");
        double num = input.nextDouble();

        System.out.println("Enter your second number :");
        double num2 = input.nextDouble();


        num = Math.round(num*1000);
        num = num/1000;

        num2 = Math.round(num2*1000);
        num2 = num2/1000;

        if(num==num2){
            System.out.println("They are the same up to three decimal places");
        }else{
            System.out.println("They are differnt");
        }
    }
}
