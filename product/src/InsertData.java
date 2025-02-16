import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InsertData {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 50, "Dell");
        Product product2 = new Product(2, "Smartphone", 150, "Samsung");
        Product product3 = new Product(3, "Tablet", 75, "Apple");
        Product product4 = new Product(4, "Headphones", 200, "Sony");
        Product product5 = new Product(5, "Smartwatch", 300, "Fitbit");

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        InsertData insertData = new InsertData();
        insertData.insertData(products);

    }

    private void insertData(List<Product> products) {
        String sql = "INSERT INTO product (id, name, quantity, brand) VALUES (?, ?, ?, ?)";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (Product product : products) {
                preparedStatement.setInt(1, product.getId());
                preparedStatement.setString(2, product.getName());
                preparedStatement.setInt(3, product.getQuantity());
                preparedStatement.setString(4, product.getBrand());

                if (preparedStatement.executeUpdate() > 0) {
                    System.out.println("data inserted!");
                } else {
                    System.out.println("data can not inserted!");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
