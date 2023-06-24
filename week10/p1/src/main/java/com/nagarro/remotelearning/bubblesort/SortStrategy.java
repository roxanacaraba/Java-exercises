package com.nagarro.remotelearning.bubblesort;

import java.util.List;

public interface SortStrategy<T> {
    List<T> sort(List<T> array, String field);
}