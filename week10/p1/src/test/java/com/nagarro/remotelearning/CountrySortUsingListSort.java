package com.nagarro.remotelearning;

import com.nagarro.remotelearning.sort.CountryComparatorByCapital;
import com.nagarro.remotelearning.sort.CountryComparatorByName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountrySortUsingListSort<T> {
    List<Country> listOfCountries = new ArrayList<>() {{
        add(new Country("Spain", "Madrid"));
        add(new Country("Romania", "Bucharest"));
        add(new Country("Italy", "Roma"));
        add(new Country("France", "Paris"));
    }};

    @Test
    public void testSortUsingCountryComparatorByName() {
        // Given
        CountryComparatorByName comparatorByName = new CountryComparatorByName();
        // When
        listOfCountries.sort(comparatorByName);
        // Then
        assertEquals("[France, Italy, Romania, Spain]", listOfCountries.toString());
    }

    @Test
    public void testSortUsingCountryComparatorByCapital() {
        // Given
        CountryComparatorByCapital comparatorByCapital = new CountryComparatorByCapital();
        // When
        listOfCountries.sort(comparatorByCapital);
        // Then
        assertEquals("[Romania, Spain, France, Italy]", listOfCountries.toString());
    }

    @Test
    public void testSortUsingCountryComparatorByCapitalWithEmptyArraylist() {
        // Given
        CountryComparatorByCapital comparatorByCapital = new CountryComparatorByCapital();
        List<Country> emptyListOfCountries = new ArrayList<>();
        // When
       emptyListOfCountries.sort(comparatorByCapital);
        // Then
        assertEquals("[]", emptyListOfCountries.toString());
    }
}
