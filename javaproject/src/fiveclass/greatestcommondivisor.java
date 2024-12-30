package fiveclass;

import java.util.Scanner;

public class greatestcommondivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integers : ");
        int s = input.nextInt();
        System.out.print("Enter second integers : ");
        int a = input.nextInt();

        int gcd= 1;
        int k = 2;

        while (k <= s && k <= a){
            if(s % k == 0 && a % k == 0){
                gcd = k;
                k++;
            }

        }
        System.out.println("The greatest common divisor for " + s +" and "+ a +" is "+gcd);
    }
}
