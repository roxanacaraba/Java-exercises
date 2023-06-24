package com.nagarro.remotelearning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PalindromeCounterTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    void testEvenPalindromeCounter() {
        long evenCount = PalindromeCounter.countEvenPalindromes(1000, 10000);
        assertEquals("Number of even palindromes: 40", outputStreamCaptor.toString()
                .trim());

        assertEquals(40, evenCount);
    }

    @Test
    void testEvenPalindromeCounterReturn0() {
        long evenCount = PalindromeCounter.countEvenPalindromes(23, 30);

        assertEquals("Number of even palindromes: 0", outputStreamCaptor.toString()
                .trim());
        assertEquals(0, evenCount);
    }

    @Test
    void testEvenPalindromeCounterWithOneNumberInRange() {
        long evenCount = PalindromeCounter.countEvenPalindromes(22, 23);

        assertEquals("Number of even palindromes: 1", outputStreamCaptor.toString()
                .trim());
        assertEquals(1, evenCount);
    }

    @Test
    void testOddPalindromeCounter() {
        long oddCount = PalindromeCounter.countOddPalindromes(1000, 10000);

        assertEquals("Number of odd palindromes: 50", outputStreamCaptor.toString()
                .trim());
        assertEquals(50, oddCount);
    }
}
