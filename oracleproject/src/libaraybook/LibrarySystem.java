package libaraybook;

import java.sql.*;
import java.util.Scanner;
public class LibrarySystem {

    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    private static final String USER = "orclpdbuser";
    private static final String PASSWORD = "isdb62"; // Replace with your MySQL password

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMainMenu();
        }
    }
    public static void showMainMenu() {
        System.out.println("Select an option:");
        System.out.println("1. List of books");
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. Exit");

        System.out.print("Enter chose number : ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                listBooks();
                break;
            case 2:
                borrowBook();
                break;
            case 3:
                returnBook();
                break;
            case 4:
                System.out.println("Exiting the program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    public static void listBooks() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM library_books WHERE availability = 'N'";
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);
                System.out.println("List of available books:");
                while (rs.next()) {
                    System.out.println("Title: " + rs.getString("title"));
                    System.out.println("Author: " + rs.getString("author"));
                    System.out.println("Year of Publication: " + rs.getInt("year_of_publication"));
                    System.out.println("Number of Pages: " + rs.getInt("number_of_pages"));
                    System.out.println("Price: $" + rs.getDouble("price"));
                    System.out.println();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Press Enter to return to the main menu...");
        scanner.nextLine();  // Wait for user input
    }
    public static void borrowBook() {
        System.out.print("Enter the title of the book to borrow (or type 'exit' to return to the menu): ");
        String title = scanner.nextLine();

        if (title.equalsIgnoreCase("exit")) {
            return;
        }

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM library_books WHERE title = ? AND availability = 'Y'";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, title);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String updateQuery = "UPDATE library_books SET availability = 'N' WHERE title = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                        updateStmt.setString(1, title);
                        updateStmt.executeUpdate();
                        System.out.println("You have successfully borrowed the book: " + title);
                    }
                } else {
                    System.out.println("Sorry, the book '" + title + "' is not available or is already borrowed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Press Enter to return to the main menu...");
        scanner.nextLine();  // Wait for user input
    }

    public static void returnBook() {
        System.out.print("Enter the title of the book to return (or type 'exit' to return to the menu): ");
        String title = scanner.nextLine();

        if (title.equalsIgnoreCase("exit")) {
            return;
        }

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM library_books WHERE title = ? AND availability = 'N'";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, title);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String updateQuery = "UPDATE library_books SET availability = 'Y' WHERE title = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                        updateStmt.setString(1, title);
                        updateStmt.executeUpdate();
                        System.out.println("You have successfully returned the book: " + title);
                    }
                } else {
                    System.out.println("Sorry, you haven't borrowed the book '" + title + "' or it doesn't exist.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Press Enter to return to the main menu");
        scanner.nextLine();
    }
}
