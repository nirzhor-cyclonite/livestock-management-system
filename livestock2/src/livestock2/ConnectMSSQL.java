/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livestock2;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectMSSQL {

    Connection connection;
    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=livestock;selectMethod=cursor", "sa", "123456");
            System.out.println("DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT OwnerName FROM Owner");
            while (resultSet.next()) {
                System.out.println("Owner Name:"
                        + resultSet.getString("OwnerName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
