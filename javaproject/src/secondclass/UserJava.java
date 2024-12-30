package secondclass;

import java.util.Scanner;

public class UserJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name :");
        String inputString = scanner.nextLine();
        System.out.print("Enter your age :");
        int nextInt = scanner.nextInt();

        System.out.println("Hi " + inputString + " you are" + nextInt + " years old");

        System.out.println("Enter a value");
    }

}
