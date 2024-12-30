package secondclass;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        //double random = Math.random();
       // System.out.println(random);
        //int castedInd = (int) (random * 100);
        //System.out.println(castedInd);
         FrMath();
    }
        public static void FrMath() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter temperature in Celsius");
            double celsius = input.nextDouble();
            double cat = (celsius * 1.8) + 32;
            System.out.println(cat + "F");
        }

        public static void Celsius(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number Celsius");
        double celsius = input.nextDouble();


        }


}
