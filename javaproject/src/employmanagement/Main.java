package employmanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {



//        Employee sr = new FullTimeEmployee("John Doe",1,50000);
//        sr.displayinformation();
//
//        Employee si = new PartTimeEmployee("Jone Doe", 2,50000);
//        si.displayinformation();
//
//        Employee sa = new ContractEmployee("David Lee", 3, 10000);
//        sa.displayinformation();

        String fileName = "C:\\Users\\Java Student PC-5\\Desktop\\1285720\\java\\javaproject\\javaproject\\src\\employmanagement\\InformationEmployee.csv";
        String ssxx = "C:\\Users\\Java Student PC-5\\Desktop\\1285720\\java\\javaproject\\javaproject\\src\\employmanagement\\CalaculatorInformation.csv";

        Scanner readfile = new Scanner(new File(fileName));

        while (readfile.hasNext()){
            String read = readfile.nextLine();
        }

    }
}

