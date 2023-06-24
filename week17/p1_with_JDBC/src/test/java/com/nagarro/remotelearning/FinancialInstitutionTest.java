package com.nagarro.remotelearning;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.*;

public class FinancialInstitutionTest {

    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    private void createDatabase() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:");
        connection.createStatement().execute("CREATE TABLE clients (username VARCHAR(255), full_name VARCHAR(255), balance DECIMAL)");
        connection.close();
    }

    @BeforeEach
    public void setUp() throws SQLException {
        createDatabase();
        FinancialInstitution.populateDatabase();

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testListAllClients() {
        FinancialInstitution.listAllClients();
        String output = outputStream.toString();

        Assertions.assertTrue(output.contains("Username: john123, Full Name: John Doe"));
        Assertions.assertTrue(output.contains("Username: jane456, Full Name: Jane Smith"));
        Assertions.assertTrue(output.contains("Username: alex789, Full Name: Alex Johnson"));
        Assertions.assertTrue(output.contains("Username: sarah321, Full Name: Sarah Davis"));
    }

    @Test
    public void testGetBalanceByUsername() {
        double balance = FinancialInstitution.getBalanceByUsername("john123");

        Assertions.assertEquals(50000.0, balance);
    }

    @Test
    public void testListClientsWithHighBalance() {
        double threshold = 100000.0;

        FinancialInstitution.listClientsWithHighBalance(threshold);
        String output = outputStream.toString();

        Assertions.assertTrue(output.contains("Username: jane456, Full Name: Jane Smith, Balance: 150000.0"));
        Assertions.assertTrue(output.contains("Username: alex789, Full Name: Alex Johnson, Balance: 250000.0"));
    }
}
