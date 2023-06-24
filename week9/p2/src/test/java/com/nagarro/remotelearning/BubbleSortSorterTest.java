package com.nagarro.remotelearning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class BubbleSortSorterTest {
    @Test
    public void bubbleSortWithIntegers() {
        // Given
        SortStrategy<Integer> bubbleSortSorter   = new BubbleSortSorter<>();
        Integer[] arrayOfIntegers = {1, 5, 9, 4};
        // When
        Integer[] results = bubbleSortSorter.sort(arrayOfIntegers);
        // Then
        Assertions.assertEquals("[1, 4, 5, 9]", Arrays.toString(results));
    }

    @Test
    public void bubbleSortWithDouble() {
        // Given
        SortStrategy<Double> bubbleSortSorter   = new BubbleSortSorter<>();
        Double[] arrayOfDoubles = {1.07, 1.09, 2.81, 4.03};
        // When
        Double[] results = bubbleSortSorter.sort(arrayOfDoubles);
        // Then
        Assertions.assertEquals("[1.07, 1.09, 2.81, 4.03]", Arrays.toString(results));
    }

    @Test
    public void bubbleSortWithStrings() {
        // Given
        SortStrategy<String> bubbleSortSorter   = new BubbleSortSorter<>();
        String[] arrayOfStrings = {"Pear", "Apple", "Pineapple"};
        // When
        String[] results = bubbleSortSorter.sort(arrayOfStrings);
        // Then
        Assertions.assertEquals("[Apple, Pear, Pineapple]", Arrays.toString(results));
    }

    @Test
    public void bubbleSortWithPersons() {
        // Given
        BubbleSortSorter<Person> bubbleSortSorter   = new BubbleSortSorter<>();
        Person[] arrayOfPersons = new Person[3];
        arrayOfPersons[0] = new Person("Ana", 53);
        arrayOfPersons[1] = new Person("Mike", 15);
        arrayOfPersons[2] = new Person("Jack", 34);
        // When
        Person[] results = bubbleSortSorter.sort(arrayOfPersons);
        // Then
        Assertions.assertEquals("[Mike, Jack, Ana]", Arrays.toString(results));
    }
}


