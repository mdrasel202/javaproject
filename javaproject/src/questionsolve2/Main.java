package questionsolve2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    String filename = "C:\\text\\text.txt";
    Scanner uud = new Scanner(new File(filename));
    while(uud.hasNext()){
        System.out.println(uud.nextLine());
    }
    }
}
