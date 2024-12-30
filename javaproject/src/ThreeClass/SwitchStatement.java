package ThreeClass;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month case statement : ");
        int month = input.nextInt();
        input.nextLine();

        System.out.print("Enter month for if else : ");
        int months = input.nextInt();

        bakorss(month);
        bakro(months);
    }

    private static void bakorss(int month) {
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            default -> System.out.println("Place give valid number");
        }
    }

    public  static void bakro(int months){

        if (months == 1) {
            System.out.println("January");
        } else if (months == 2) {
            System.out.println("February");
        } else if (months == 3) {
            System.out.println("March");
        } else if (months == 4) {
            System.out.println("April");
        } else if (months == 5) {
            System.out.println("May");
        } else {
            System.out.println("Place give valid number");
        }
    }
}
