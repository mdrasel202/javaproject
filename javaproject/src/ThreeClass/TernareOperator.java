package ThreeClass;

import java.util.Scanner;

public class TernareOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int name = input.nextInt();
        input.nextLine();
        int nameTwo = input.nextInt();
        input.nextLine();
        //int max;

        System.out.println("First num : "+ name);
        System.out.println("Second num : "+nameTwo);

        int max = (name>nameTwo) ? name : nameTwo;

        System.out.println("Maximum is : "+max);
    }
}


