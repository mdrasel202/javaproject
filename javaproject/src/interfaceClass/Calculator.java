package interfaceClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("choose operator: ");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            jorKora(a, b);
        }
        if (operator == '-') {
            biyogKora(a, b);
        }

    }

    static void jorKora(double a, double b) {
        double jog = a + b;
        System.out.println("jogfol: " + jog);
    }

    static void biyogKora(double a, double b) {
        double biyog = a - b;
        System.out.println("biyogfol: " + biyog);
    }
}
