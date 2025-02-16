package product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    static final String USER = "orclpdbuser";
    static final String PASSWORD = "isdb62";

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

        for (Product product : products) {
            insertProductData(product);
        }

        System.out.println("Products in the database:");
        List<Product> fetchedProducts = selectProducts();
        for (Product product : fetchedProducts) {
            System.out.println(product);
        }


        //update
        Product productToUpdate = fetchedProducts.get(0);  // Example: updating the first product
        productToUpdate.setQuantity(80);  // Update the quantity
        productToUpdate.setName("Updated Smartphone");  // Update the name
        updateProductData(productToUpdate);

        System.out.println("\nAfter updating:");
        List<Product> updatedProducts = selectProducts();
        for (Product product : updatedProducts) {
            System.out.println(product);
        }


        Product productToDelete = updatedProducts.get(4);  // Example: deleting the second product
        deleteProductData(productToDelete.getId());

        // Select and display products after deletion
        System.out.println("\nAfter deletion:");
        List<Product> productsAfterDeletion = selectProducts();
        for (Product product : productsAfterDeletion) {
            System.out.println(product);
        }
    }

    public static void insertProductData(Product product) {
        String sql = "INSERT INTO product (id, name, quantity, brand) VALUES(?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getBrand());

            preparedStatement.executeUpdate();
            System.out.println("Product inserted: " + product);
        } catch (SQLException e) {
            System.out.println("Error inserting product: " + e.getMessage());
        }
    }

    public static List<Product> selectProducts() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM product";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                String brand = resultSet.getString("brand");

                products.add(new Product(id, name, quantity, brand));
            }
        } catch (SQLException e) {
            System.out.println("Error selecting products: " + e.getMessage());
        }
        return products;
    }

    public static void updateProductData(Product product) {
        String sql = "UPDATE product SET name = ?, quantity = ?, brand = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getQuantity());
            preparedStatement.setString(3, product.getBrand());
            preparedStatement.setInt(4, product.getId());

            preparedStatement.executeUpdate();
            System.out.println("Product updated: " + product);
        } catch (SQLException e) {
            System.out.println("Error updating product: " + e.getMessage());
        }
    }


    public static void deleteProductData(int productId) {
        String sql = "DELETE FROM product WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, productId);
            preparedStatement.executeUpdate();
            System.out.println("Product with ID " + productId + " deleted.");
        } catch (SQLException e) {
            System.out.println("Error deleting product: " + e.getMessage());
        }
    }
}
