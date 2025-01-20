package redfileandinsertfile;

import book.InsertBookData;
import book1.SelectStudentOracle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     InsertDataOracle inset = new InsertDataOracle();
        inset.insertDummyDataBook(shops);
    }
//    public static void main(String[] args) throws FileNotFoundException {
//
//        String csvfile = "C:\\Users\\Java Student PC-5\\Desktop\\1285720\\java\\javaproject\\oracleproject\\src\\redfileandinsertfile";
//        Scanner input = new Scanner(new File(csvfile));
//        while (input.hasNextLine()) {
//            String line = input.nextLine();
//            System.out.println(line);
//        }
//        input.close();
//
//    }
}
