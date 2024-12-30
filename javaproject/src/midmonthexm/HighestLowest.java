package midmonthexm;
import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = scanner.nextInt();

        int highest = Math.max(num1, Math.max(num2, num3));
        int lowest = Math.min(num1, Math.min(num2, num3));

        System.out.println("The highest number is: " + highest);
        System.out.println("The lowest number is: " + lowest);

        scanner.close();
    }
}
