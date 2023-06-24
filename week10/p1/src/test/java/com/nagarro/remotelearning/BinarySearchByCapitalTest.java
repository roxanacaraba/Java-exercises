package com.nagarro.remotelearning;

import com.nagarro.remotelearning.binarysearch.BinarySearchByCapital;
import com.nagarro.remotelearning.sort.CountryComparatorByCapital;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchByCapitalTest {
    List<Country> listOfCountries = new ArrayList<>() {{
        add(new Country("Spain", "Madrid"));
        add(new Country("Romania", "Bucharest"));
        add(new Country("Italy", "Roma"));
        add(new Country("France", "Paris"));
    }};

    @Test
    public void testBinarySearchReturnTrue() {
        // Given
        CountryComparatorByCapital comparatorByCapital = new CountryComparatorByCapital();
        BinarySearchByCapital binarySearchByCapital = new BinarySearchByCapital();
        listOfCountries.sort(comparatorByCapital);
        // When
        String result = binarySearchByCapital.binarySearchByCapital(listOfCountries, "Paris", comparatorByCapital);
        // Then
        assertEquals("France", result);
    }

    @Test
    public void testBinarySearchReturnFalse() {
        // Given
        CountryComparatorByCapital comparatorByCapital = new CountryComparatorByCapital();
        BinarySearchByCapital binarySearchByCapital = new BinarySearchByCapital();
        listOfCountries.sort(comparatorByCapital);
        // When
        String result = binarySearchByCapital.binarySearchByCapital(listOfCountries, "Paris", comparatorByCapital);
        // Then
        assertNotEquals("Romania", result);
    }

    @Test
    public void testBinarySearchUsingNonExistingCapital() {
        // Given
        CountryComparatorByCapital comparatorByCapital = new CountryComparatorByCapital();
        BinarySearchByCapital binarySearchByCapital = new BinarySearchByCapital();
        listOfCountries.sort(comparatorByCapital);
        // Then
        assertThrows(IndexOutOfBoundsException.class,
                () -> binarySearchByCapital
                        .binarySearchByCapital(listOfCountries, "Pis", comparatorByCapital));
    }
}
