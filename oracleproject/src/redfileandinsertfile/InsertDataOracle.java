package redfileandinsertfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;

import static redfileandinsertfile.Oracles.*;

public class InsertDataOracle extends Oracles{
//    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
//    private static final String USER = "orclpdbuser";
//    private static final String PASSWORD = "isdb62";

    public void insertDummyDataBook(String[][] shops) {
        String insertQuery = "INSERT INTO SHOPS (name, author, genre, price, publichdate) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            for(String[] shop : shops){
                preparedStatement.setInt(1, Integer.parseInt(shop[0]));
                preparedStatement.setString(2,shop[1]);
                preparedStatement.setString(3,shop[2]);
                preparedStatement.setDouble(4,Double.parseDouble(shop[3]));
                preparedStatement.setDate(5, Date.valueOf(shop[4]));
                preparedStatement.setDate(6,Date.valueOf(shop[5]));

                preparedStatement.addBatch();
            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }
}
