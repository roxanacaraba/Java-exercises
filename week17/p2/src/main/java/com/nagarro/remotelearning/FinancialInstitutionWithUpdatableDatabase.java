package com.nagarro.remotelearning;

import java.sql.*;

public class FinancialInstitutionWithUpdatableDatabase {
    private static final String DB_URL = "jdbc:h2:mem:financial_institution2;DB_CLOSE_DELAY=-1";
    private static final String DB_USERNAME = "FinancialInstitution2023";
    private static final String DB_PASSWORD = "Pass@wordFI#DBUp";

    static void createDatabase() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS clients");
            statement.execute("DROP TABLE IF EXISTS financial_operations");
            statement.execute("CREATE TABLE clients (username VARCHAR(255), full_name VARCHAR(255), balance DECIMAL)");
            statement.execute("CREATE TABLE financial_operations (username VARCHAR(255), operation_type VARCHAR(255), amount DECIMAL)");
            System.out.println("Database created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void populateDatabase() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("INSERT INTO clients VALUES ('john123', 'John Doe', 50000.0)");
            statement.executeUpdate("INSERT INTO clients VALUES ('jane456', 'Jane Smith', 150000.0)");
            statement.executeUpdate("INSERT INTO clients VALUES ('alex789', 'Alex Johnson', 250000.0)");
            statement.executeUpdate("INSERT INTO clients VALUES ('sarah321', 'Sarah Davis', 75000.0)");
            System.out.println("Database populated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void listAllClients() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM clients")) {
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String fullName = resultSet.getString("full_name");
                System.out.println("Username: " + username + ", Full Name: " + fullName + ", Balance: " + getBalanceByUsername(username));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static double getBalanceByUsername(String username) {
        double balance = 0.0;
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("SELECT balance FROM clients WHERE username = ?")) {
            statement.setString(1, username);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    balance = resultSet.getDouble("balance");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balance;
    }

    static void listClientsWithHighBalance(double threshold) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM clients WHERE balance > ?")) {
            statement.setDouble(1, threshold);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String username = resultSet.getString("username");
                    String fullName = resultSet.getString("full_name");
                    double balance = resultSet.getDouble("balance");
                    System.out.println("Username: " + username + ", Full Name: " + fullName + ", Balance: " + balance);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void performFinancialOperation(String username, String operationType, double amount) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement updateStatement = connection.prepareStatement("UPDATE clients SET balance = balance + ? WHERE username = ?");
             PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO financial_operations VALUES (?, ?, ?)")) {

            connection.setAutoCommit(false);

            updateStatement.setDouble(1, amount);
            updateStatement.setString(2, username);
            updateStatement.executeUpdate();

            insertStatement.setString(1, username);
            insertStatement.setString(2, operationType);
            insertStatement.setDouble(3, amount);
            insertStatement.executeUpdate();

            connection.commit();

            System.out.println("Financial operation performed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
