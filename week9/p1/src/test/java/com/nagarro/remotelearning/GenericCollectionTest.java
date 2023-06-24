package com.nagarro.remotelearning;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericCollectionTest {

    @Test
    public void testContainsAllWithIntegersUsingArraylistReturnTrue() {
        // Given
        MyCollection<Integer> collectionOfIntegers = new GenericCollection<>(new ArrayList<>());
        collectionOfIntegers.addAll(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        // When
        boolean result = collectionOfIntegers.containsAll(Arrays.asList(1, 4, 3, 2));
        // Then
        assertTrue(result);
    }

    @Test
    public void testContainsAllWithIntegersUsingArraylistReturnFalse() {
        // Given
        MyCollection<Integer> collectionOfIntegers = new GenericCollection<>(new ArrayList<>());
        collectionOfIntegers.addAll(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        // When
        boolean result = collectionOfIntegers.containsAll(Arrays.asList(1, 4, 7, 2));
        // Then
        assertFalse(result);
    }

    @Test
    public void testContainsAllWithStringsUsingArraylistReturnTrue() {
        // Given
        MyCollection<String> collectionOfStrings = new GenericCollection<>(new ArrayList<>());
        collectionOfStrings.addAll(new ArrayList<>(Arrays.asList("A", "B", "C", "D")));
        // When
        boolean result = collectionOfStrings.containsAll(Arrays.asList("D", "A", "C", "B"));
        // Then
        assertTrue(result);
    }

    @Test
    public void testContainsAllWithStringsUsingArraylistReturnFalse() {
        // Given
        MyCollection<String> collectionOfStrings = new GenericCollection<>(new ArrayList<>());
        collectionOfStrings.addAll(new ArrayList<>(Arrays.asList("A", "B", "C", "D")));
        // When
        boolean result = collectionOfStrings.containsAll(Arrays.asList("D", "J", "C", "B"));
        // Then
        assertFalse(result);
    }
    @Test
    public void testContainsAllWithStringsUsingHashsetReturnTrue() {
        // Given
        MyCollection<String> collectionOfStrings = new GenericCollection<>(new HashSet<>());
        collectionOfStrings.addAll(new HashSet<>(Arrays.asList("1", "2", "3")));
        // When
        boolean result = collectionOfStrings.containsAll(Arrays.asList("2", "3", "1"));
        // Then
        assertTrue(result);
    }

    @Test
    public void testContainsAllWithStringsUsingHashsetReturnFalse() {
        // Given
        MyCollection<String> collectionOfStrings = new GenericCollection<>(new HashSet<>());
        collectionOfStrings.addAll(new HashSet<>(Arrays.asList("1", "2", "3")));
        // When
        boolean result = collectionOfStrings.containsAll(Arrays.asList("2", "3", "1", "4"));
        // Then
        assertFalse(result);
    }
}
