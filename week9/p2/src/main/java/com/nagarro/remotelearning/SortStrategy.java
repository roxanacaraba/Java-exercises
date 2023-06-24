package com.nagarro.remotelearning;

public interface SortStrategy<T> {
    T[] sort(T[] array);
}