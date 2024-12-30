package midmonthexm;
import java.util.Scanner;

public class NegativePositive {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;

            while (true) {
                System.out.print("Enter an integer number : ");
                int num = scanner.nextInt();

                if (num < 0) {
                    break;
                }
                if (num > 0) {
                    sum += num;
                }
            }
            System.out.println("The sum of the positive integers is: " + sum);
            scanner.close();
        }
    }

