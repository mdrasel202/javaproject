package fiveclass;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Multiplication table ");
        int a = input.nextInt();
        //Display the number title
        System.out.print("    ");
        for(int j =1; j<=a; j++){

            System.out.print("   "+j);
        }System.out.println("\n----------------------------------------");

        //Display table body
        for(int i=1; i<=a; i++){
            System.out.print(i +" | ");
            for(int j=1; j<=a; j++){
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
