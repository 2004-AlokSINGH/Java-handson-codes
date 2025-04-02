package com.alok.project1.ProjectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // 1. Register the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbdemo1", "root", "rootalok");

            // 3. Create Statement
            statement = connection.createStatement();

            // 4. Execute Query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

            // 5. Process Results
            while (resultSet.next()) {
                String id = resultSet.getString("id"); 
                String name = resultSet.getString("NAME");
                Double Salary=resultSet.getDouble("SALARY");
                System.out.println("ID: " + id + ", Name: " + name+", Salary: "+Salary);
            }

            // Close ResultSet
            resultSet.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
