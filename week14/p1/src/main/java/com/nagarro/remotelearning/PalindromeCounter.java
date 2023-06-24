package com.nagarro.remotelearning;

import java.util.stream.IntStream;

public class PalindromeCounter {
    public static long countEvenPalindromes(int start, int stop) {
        long evenCount = IntStream.range(start, stop)
                .filter(PalindromeCounter::isPalindrome)
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println("Number of even palindromes: " + evenCount);
        return evenCount;
    }

    public static long countOddPalindromes(int start, int stop) {
        long oddCount = IntStream.range(start, stop)
                .filter(PalindromeCounter::isPalindrome)
                .filter(number -> number % 2 != 0)
                .count();
        System.out.println("Number of odd palindromes: " + oddCount);
        return oddCount;
    }

    private static boolean isPalindrome(int number) {
        String string = String.valueOf(number);
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
