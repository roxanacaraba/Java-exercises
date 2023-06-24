import com.nagarro.remotelearning.FinancialInstitution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class FinancialInstitutionTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp() {
        FinancialInstitution.populateDatabase();

        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testListAllClients() {
        Assertions.assertDoesNotThrow(() -> {
            FinancialInstitution.listAllClients();
        });
    }

    @Test
    public void testGetBalanceByUsername() {
        String username = "john123";
        double expectedBalance = 50000.0;

        double actualBalance = FinancialInstitution.getBalanceByUsername(username);

        Assertions.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testGetBalanceByUsername_NonExistingUser() {
        String username = "nonexistent";
        double expectedBalance = 0.0;

        double actualBalance = FinancialInstitution.getBalanceByUsername(username);

        Assertions.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testListClientsWithHighBalanceDoesNotThrow() {
        double threshold = 100000.0;

        Assertions.assertDoesNotThrow(() -> {
            FinancialInstitution.listClientsWithHighBalance(threshold);
        });
    }

    @Test
    public void testListClientsWithHighBalance() {
        double threshold = 100000.0;
        FinancialInstitution.listClientsWithHighBalance(threshold);

        String output = outputStream.toString();
        List<String> expectedFullNames = Arrays.asList(
                "Jane Smith",
                "Alex Johnson"
        );

        for (String expectedFullName : expectedFullNames) {
            Assertions.assertTrue(output.contains(expectedFullName));
        }
    }
}