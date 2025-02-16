import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        int id;
        id = 1;

        DeleteData deleteData = new DeleteData();
        deleteData.updateData(id);

    }

    private void updateData(int id) {
        String sql = "DELETE FROM product WHERE id = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("data deleted!");
            } else {
                System.out.println("no data deleted!");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
