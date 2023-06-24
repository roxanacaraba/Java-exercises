package com.nagarro.remotelearning;

public class BubbleSortSorter<T extends Comparable> implements SortStrategy<T>{
    @Override
    public T[] sort(T[] array) {
        int lengthOfArray = array.length;
        while (lengthOfArray > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < lengthOfArray; currentIndex++) {
                if (0 < array[currentIndex - 1].compareTo(array[currentIndex])) {
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            lengthOfArray = lastModifiedIndex;
        }
        return array;
    }
}