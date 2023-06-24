package com.nagarro.remotelearning;

import static org.junit.jupiter.api.Assertions.*;
import com.nagarro.remotelearning.bubblesort.BubbleSort;
import com.nagarro.remotelearning.bubblesort.InvalidFieldException;
import com.nagarro.remotelearning.bubblesort.SortStrategy;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class CountrySortUsingBubbleSort {
    SortStrategy<Country> bubbleSorter = new BubbleSort<>();
    List<Country> listOfCountries = new ArrayList<>() {{
        add(new Country("Spain", "Madrid"));
        add(new Country("Romania", "Bucharest"));
        add(new Country("Italy", "Roma"));
        add(new Country("France", "Paris"));
    }};
    List<Country> emptyListOfCountries = new ArrayList<>();

    @Test
    public void testBubbleSortByName() {
        // When
        List<Country> sortedArraylist = bubbleSorter.sort(listOfCountries, "name");
        // Then
        assertEquals("[France, Italy, Romania, Spain]", sortedArraylist.toString());
    }

    @Test
    public void testBubbleSortByCapital() {
        // When
        List<Country> sortedArraylist = bubbleSorter.sort(listOfCountries, "capital");
        // Then
        assertEquals("[Romania, Spain, France, Italy]", sortedArraylist.toString());
    }

    @Test
    public void testBubbleSortWithEmptyArraylist() {
        // When
        List<Country> sortedArraylist = bubbleSorter.sort(emptyListOfCountries, "capital");
        // Then
        assertEquals("[]", sortedArraylist.toString());
    }

    @Test
    public void testCustomCompareThrowsInvalidFieldException() {
        // Then
        assertThrows(InvalidFieldException.class, () -> bubbleSorter.sort(listOfCountries, "population"));
    }
}
