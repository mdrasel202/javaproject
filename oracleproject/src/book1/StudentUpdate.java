package book1;
import java.sql.*;

public class StudentUpdate extends Oracle{
    public void upadate() {

        String insertSQL = "UPDATE studentjdbc SET name= ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(insertSQL);

            stmt.setString(1, "ikram");
            stmt.setString(2, "4");

            int rowsAffected = stmt.executeUpdate();

            System.out.println(rowsAffected + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

