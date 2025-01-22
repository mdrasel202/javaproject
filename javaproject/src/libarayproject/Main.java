package libarayproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 1000, 10.00, true);
        Book book1 = new Book("1984", "George Orwell", 1949, 100, 20.00, true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1985, 2000, 30.00, true);

        books.add(book);
        books.add(book1);
        books.add(book2);

        for (Book b : books) {
            b.displayInformation();
        }

        while (true) {
            System.out.println("Select an option_");
            System.out.println("1.Borrow a book");
            System.out.println("2.Return a book");
            System.out.println("3.Option to terminate the progra");

            System.out.print("Chose a option : ");
            int main =  scanner.nextInt();
        }


    }
}