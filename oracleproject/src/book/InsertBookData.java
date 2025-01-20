package book;

import java.sql.*;

public class InsertBookData {
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    private static final String USER = "orclpdbuser";
    private static final String PASSWORD = "isdb62";

    public void insertDummyDataBook(String[][] books) {
        String insertQuery = "INSERT INTO bookuser (name, author, genre, price, publichdate) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            for (String[] book : books) {
                try {
                    double price = Double.parseDouble(book[3]);
                    if (price < 0 || price > 99999.99) { // Assuming the price should be within 99999.99
                        System.out.println("Price value is out of range: " + book[3]);
                        continue; // Skip this book
                    }
                    preparedStatement.setDouble(4, price);

                    try {
                        preparedStatement.setDate(5, Date.valueOf(book[4])); // Ensure the date is in "yyyy-MM-dd" format
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid date format for book: " + book[0] + " with date " + book[4]);
                        continue; // Skip this book
                    }

                    preparedStatement.setString(1, book[0]); // Name
                    preparedStatement.setString(2, book[1]); // Author
                    preparedStatement.setString(3, book[2]); // Genre

                    preparedStatement.addBatch();

                } catch (NumberFormatException e) {
                    System.out.println("Invalid price format for book: " + book[0] + " with price " + book[3]);
                }
            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example of calling the insertDummyDataBook method
        String[][] books = {
                {"The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "10.99", "1925-04-10"},
                {"To Kill a Mockingbird", "Harper Lee", "Fiction", "12.49", "1960-07-11"},
                {"1984", "George Orwell", "Dystopian", "14.99", "1949-06-08"},
                {"Invalid Book", "Unknown Author", "Fiction", "1000000.00", "2025-01-19"} // Example of invalid price
        };

        InsertBookData insertBookData = new InsertBookData();
        insertBookData.insertDummyDataBook(books);
    }
}
