package com.tutorial.Tutorial;

import java.sql.*;

/**
 * Owner - Arora Consulting Private Limited
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial
 * Created_on - November 09 - 2024
 * Created_at - 20:30
 */

public class DataBinding {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String user = "username";
        String password = "password";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(url, user, password);
            // Creating a statement
            Statement statement = connection.createStatement();
            // Executing a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            // Processing the results
            while (resultSet.next()) {
                System.out.println("User ID: " + resultSet.getInt("id"));
                System.out.println("Username: " + resultSet.getString("username"));
            }

            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
