package com.nagarro.remotelearning;

public interface ElementAggregator<T> {
    T aggregate(T element1, T element2, T element3, T element4);
}
