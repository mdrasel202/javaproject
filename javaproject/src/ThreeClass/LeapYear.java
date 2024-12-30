package ThreeClass;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year : ");

        int Year = input.nextInt();

        if((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
            System.out.println(Year+"is a leap year");
        }else {
            System.out.println(Year+" is a not leap year");
        }
    }
}
