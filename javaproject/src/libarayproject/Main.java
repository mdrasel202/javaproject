package libarayproject;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book>books = new ArrayList<>();

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 1000, 10.00, true);
        Book book1 = new Book("1984", "George Orwell", 1949, 100, 20.00, true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1985, 2000, 30.00, true);

        books.add(book);
        books.add(book1);
        books.add(book2);

        for(Book b : books){
            b.displayInformation();
        }

    public void displayTex(){
            System.out.println("Select an option_");
            System.out.println("Borrow a book");
            System.out.println("Return a book");
            System.out.println("Option to terminate the progra");
        }

    }

}
