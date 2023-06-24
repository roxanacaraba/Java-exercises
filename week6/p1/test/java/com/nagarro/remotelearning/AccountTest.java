package com.nagarro.remotelearning;

import com.nagarro.remotelearning.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private final Account accountForTest = new Account("Michael", 32873, 500);

    @Before
    public void setUp() {
        this.accountForTest.setBalance(500);
    }

    @Test
    public void testDepositWithAmountValid() {
        float amount = 100;
        boolean result = this.accountForTest.deposit(amount);
        assertTrue(result);
    }

    @Test
    public void testDepositWithAmountInvalid() {
        float amount = -100;
        boolean result = this.accountForTest.deposit(amount);
        assertFalse(result);
    }

    @Test
    public void testWithdrawWithValidWithdrawal() {
        float amount = 200;
        float fee = 20;
        boolean result = this.accountForTest.withdraw(amount, fee);
        assertTrue(result);
    }

    @Test
    public void testWithdrawWithInvalidWithdrawal() {
        float amount = 600;
        float fee = 60;
        boolean result = this.accountForTest.withdraw(amount, fee);
        assertFalse(result);
    }

    @Test
    public void testAddInterest() {
        accountForTest.addInterest();
        float result = this.accountForTest.getBalance();
        assertEquals(522.5f, result);
    }

    @Test
    public void testGetBalance() {
        float result = this.accountForTest.getBalance();
        assertEquals(500, result);
    }

    @Test
    public void testGetAccountNumber() {
        float result = this.accountForTest.getAccountNumber();
        assertEquals(32873, result);
    }

    @Test
    public void testToString() {
        String result = this.accountForTest.toString();
        assertEquals("32873\tMichael\t$500.00", result);
    }
}
