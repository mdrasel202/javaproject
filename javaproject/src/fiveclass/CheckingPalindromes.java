package fiveclass;

import java.util.Scanner;

public class CheckingPalindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        String a = input.nextLine();
        
        int low = 0;
        int high = a.length() -1;
        
        boolean Number = true;
        while (low < high){
            if(a.charAt(low) != a.charAt(high)){
                Number = false;
                break;
            }
                low++;
                high--;

        }
        if (Number){
            System.out.println(a + " is a plindrome");
        }else{
            System.out.println(a + " is not a plindrome");
        }
                
    }
}
