package sevenclass;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a mathematical expression: ");
        String z = s.nextLine();
        ArrayList<Character> cal = new ArrayList<>();

        for (int i = 0; i < z.length(); i++) {
            cal.add(z.charAt(i));
        }

        int result = 0;
        int currentNum = 0;
        char lastOperator = '+';

        for (int i = 0; i < cal.size(); i++) {
            char ch = cal.get(i);

            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            }

            if (!Character.isDigit(ch) || i == cal.size() - 1) {
                switch (lastOperator) {
                    case '+':
                        result += currentNum;
                        break;
                    case '-':
                        result -= currentNum;
                        break;
                    case '*':
                        result *= currentNum;
                        break;
                    case '/':
                        if (currentNum != 0) {
                            result /= currentNum;
                        } else {
                            System.out.println("Error: Division by zero.");
                            return;
                        }
                        break;
                }

                lastOperator = ch;
                currentNum = 0;
            }
        }

        System.out.println("Result: " + result);

        s.close();
    }
}

