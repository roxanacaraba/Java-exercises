package com.nagarro.remotelearning;

import org.junit.jupiter.api.Test;

import static com.nagarro.remotelearning.Transformer.applyTransformations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TransformerTest {
    Integer[] arrayOfIntegersInput = {1, 2, 3, 4};
    String[] arrayOfStringsInput = {"one", "two", "three", "four"};

    @Test
    void testSumIntegers() {
        ElementAggregator<Integer> summer = (a, b, c, d) -> a + b + c + d;

        applyTransformations(arrayOfIntegersInput, summer, System.out::println);

        assertEquals(10, summer.aggregate(1, 2, 3, 4));
    }

    @Test
    void testProductIntegers() {
        ElementAggregator<Integer> multiplier = (a, b, c, d) -> a * b * c * d;

        applyTransformations(arrayOfIntegersInput, multiplier, System.out::println);

        assertEquals(24, multiplier.aggregate(1, 2, 3, 4));
    }

    @Test
    void testConcatenateStrings() {
        ElementAggregator<String> concatenator = (a, b, c, d) -> a + b + c + d;

        applyTransformations(arrayOfStringsInput, concatenator, System.out::println);

        assertEquals("onetwothreefour", concatenator.aggregate("one", "two", "three", "four"));
    }

    @Test
    void testConcatenateStringsWithSpaces() {
        ElementAggregator<String> spaceConcatenator = (a, b, c, d) -> a + " " + b + " " + c + " " + d;

        applyTransformations(arrayOfStringsInput, spaceConcatenator, System.out::println);

        assertEquals("one two three four", spaceConcatenator.aggregate("one", "two", "three", "four"));
    }

    @Test
    void testInvalidInput() {
        Integer[] input = {1, 2, 3};

        ElementAggregator<Integer> summer = (a, b, c, d) -> a + b + c + d;

        assertThrows(IllegalArgumentException.class, () -> applyTransformations(input, summer, System.out::println));
    }
}
