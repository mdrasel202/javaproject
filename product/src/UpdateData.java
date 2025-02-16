import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        int id, quantity;
        id = 3;
        quantity = 8;

        UpdateData updateData = new UpdateData();
        updateData.updateData(id, quantity);

    }

    private void updateData(int id, int quantity) {
        String sql = "UPDATE product SET quantity = ? WHERE id = ?";
        try (Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, quantity);
            statement.setInt(2, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("data updated!");
            } else {
                System.out.println("no data updated!");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
