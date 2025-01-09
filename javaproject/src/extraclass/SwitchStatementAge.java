package extraclass;

import java.util.Scanner;

public class SwitchStatementAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age : ");
        age = input.nextInt();

        int test = age>=18?1:0;
        switch(test){
            case 0 :
                System.out.println("you are not eligible for voting");
                break;
            case 1 :
                System.out.println("you are eligible for voting");
        }
    }
}
