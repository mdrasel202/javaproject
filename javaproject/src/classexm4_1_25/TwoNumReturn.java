package classexm4_1_25;

import java.util.Scanner;

public class TwoNumReturn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        if(sum<100){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
