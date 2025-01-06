package exmclass1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadPlainTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\text\\text.txt");
        //Path read = Paths.get("C:\\SQL2022\\Developer_ENU");

        Scanner read = new Scanner(new File(String.valueOf(file)));

        while(read.hasNext()){
            System.out.println(read.nextLine());
        }
    }
}
