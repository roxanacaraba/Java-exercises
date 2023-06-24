package com.nagarro.remotelearning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCustomDate {
    private CustomDate currentDate;

    @BeforeEach
    public void setUp() {
        currentDate = new CustomDate();
    }

    @Test
    public void testPrintCurrentDateReturnCurrentDate() {
        // When
        String result = currentDate.printCurrentDate();
        // Then
        assertEquals(result, "MONDAY 6 MARCH 2023");
    }

    @Test
    public void testPrintCurrentDateReturnIncorrectDayOfTheWeek() {
        // When
        String result = currentDate.printCurrentDate();
        // Then
        assertNotEquals(result, "SOMEDAY 6 MARCH 2023");
    }

    @Test
    public void testPrintCurrentDateReturnIncorrectDate() {
        // When
        String result = currentDate.printCurrentDate();
        // Then
        assertNotEquals(result, "MONDAY 32 MARCH 2023");
    }

    @Test
    public void testPrintCurrentDateReturnIncorrectMonth() {
        // When
        String result = currentDate.printCurrentDate();
        // Then
        assertNotEquals(result, "MONDAY 6 SOMEMONTH 2023");
    }

    @Test
    public void testPrintCurrentDateReturnIncorrectYear() {
        // When
        String result = currentDate.printCurrentDate();
        // Then
        assertNotEquals(result, "MONDAY 6 MARCH 2050");
    }
}
