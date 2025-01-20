package redfileandinsertfile;

import java.sql.*;

import static redfileandinsertfile.Oracles.*;

public class ReadDataOracle extends Oracles{
    String selectQuery = "SELECT * FROM SHOPS";

    public void selectAllStudent(){
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery)){

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int buyer = resultSet.getInt("buyer");
                String seller = resultSet.getString("seller");
                String price = resultSet.getString("price");
                String buyDate = resultSet.getString("buyDate");
                String sellDate = resultSet.getString("sellDate");

                System.out.println("ID : "+ id +", Name : "+name+", buyer : "+buyer+", seller"+seller+", price"+price+", buyDate"+buyDate+", sellDate"+sellDate);

            }
        }catch(SQLException e){
            System.out.println("Error selecting data : "+e.getMessage());
        }
    }
}
