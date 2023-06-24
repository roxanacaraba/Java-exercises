package com.nagarro.remotelearning;

import java.sql.*;

public class FinancialInstitution {

    private static final String DB_URL = "jdbc:h2:mem:financial_institution;DB_CLOSE_DELAY=-1";
    private static final String DB_USER = "financialinsitution";
    private static final String DB_PASSWORD = "PassWord@FI#DB";

    public static void populateDatabase() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE clients (username VARCHAR(255), full_name VARCHAR(255), balance DECIMAL)");

            statement.execute("INSERT INTO clients (username, full_name, balance) VALUES ('john123', 'John Doe', 50000.0)");
            statement.execute("INSERT INTO clients (username, full_name, balance) VALUES ('jane456', 'Jane Smith', 150000.0)");
            statement.execute("INSERT INTO clients (username, full_name, balance) VALUES ('alex789', 'Alex Johnson', 250000.0)");
            statement.execute("INSERT INTO clients (username, full_name, balance) VALUES ('sarah321', 'Sarah Davis', 80000.0)");

            System.out.println("Database populated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void listAllClients() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients");

            System.out.println("List of all clients:");
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String fullName = resultSet.getString("full_name");
                System.out.println("Username: " + username + ", Full Name: " + fullName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static double getBalanceByUsername(String username) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("SELECT balance FROM clients WHERE username = ?");
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getDouble("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0.0;
    }

    public static void listClientsWithHighBalance(double threshold) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM clients WHERE balance > ?");
            statement.setDouble(1, threshold);
            ResultSet resultSet = statement.executeQuery();

            System.out.println("List of clients with a balance over " + threshold + ":");
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String fullName = resultSet.getString("full_name");
                double balance = resultSet.getDouble("balance");
                System.out.println("Username: " + username + ", Full Name: " + fullName + ", Balance: " + balance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
