package com.nagarro.remotelearning;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class FinancialInstitutionWithUpdatableDatabaseTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        FinancialInstitutionWithUpdatableDatabase.createDatabase();
        FinancialInstitutionWithUpdatableDatabase.populateDatabase();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testListAllClients() {
        FinancialInstitutionWithUpdatableDatabase.listAllClients();
        String expectedOutput =
                "Database created successfully." + System.lineSeparator() +
                "Database populated successfully." + System.lineSeparator()+
                "Username: john123, Full Name: John Doe, Balance: 50000.0" + System.lineSeparator() +
                "Username: jane456, Full Name: Jane Smith, Balance: 150000.0" + System.lineSeparator() +
                "Username: alex789, Full Name: Alex Johnson, Balance: 250000.0" + System.lineSeparator() +
                "Username: sarah321, Full Name: Sarah Davis, Balance: 75000.0" + System.lineSeparator();

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetBalanceByUsername() {
        double balance = FinancialInstitutionWithUpdatableDatabase.getBalanceByUsername("john123");

        assertEquals(50000.0, balance);
    }

    @Test
    public void testListClientsWithHighBalance() {
        FinancialInstitutionWithUpdatableDatabase.listClientsWithHighBalance(100000.0);
        String expectedOutput =
                "Database created successfully." +  System.lineSeparator() +
                "Database populated successfully." + System.lineSeparator() +
                "Username: jane456, Full Name: Jane Smith, Balance: 150000.0" + System.lineSeparator() +
                "Username: alex789, Full Name: Alex Johnson, Balance: 250000.0" + System.lineSeparator();

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testPerformFinancialOperation() {
        FinancialInstitutionWithUpdatableDatabase.performFinancialOperation("john123", "Salary", 5000.0);

        double updatedBalance = FinancialInstitutionWithUpdatableDatabase.getBalanceByUsername("john123");

        assertEquals(55000.0, updatedBalance);
    }
}
