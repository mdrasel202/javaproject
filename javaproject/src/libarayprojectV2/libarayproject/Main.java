package libarayprojectV2.libarayproject;

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

//        for (Book b : books) {
//            b.displayInformation();
//        }

        while (true) {
            System.out.println("Select an option_");
            System.out.println("1.Borrow a book");
            System.out.println("2.Return a book");
            System.out.println("3.Option to terminate the progra");

            System.out.print("Chose a option : ");
            int main = scanner.nextInt();
            scanner.nextLine();

            switch (main) {
                case 1:
                    libaryBook(books);
                    break;
                case 2:
                    borrowBook(books, scanner);
                    break;
            }
        }
    }

    public static void libaryBook(List<Book> books) {
        for (Book b : books) {
            b.displayInformation();
        }
    }

    public static void borrowBook(List<Book> books, Scanner scanner) {
        System.out.println("Enter the book name borrowbook : ");
        String title = scanner.nextLine();

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                if (b.isAvailability()) {
                    b.setAvailability(false);
                    System.out.println("You have successfully borrow :" + title);
                } else {
                    System.out.println("Sorry the book is already borrow");
                }
            }
        }
    }
}