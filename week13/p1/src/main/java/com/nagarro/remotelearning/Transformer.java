package com.nagarro.remotelearning;

import java.util.function.Consumer;

public class Transformer {
    public static <T> void applyTransformations(T[] data, ElementAggregator<T> aggregator, Consumer<T> consumer) {
        if (data.length < 4) {
            throw new IllegalArgumentException("Data array must have at least 4 elements");
        }

        T result = aggregator.aggregate(data[0], data[1], data[2], data[3]);
        consumer.accept(result);
    }
}
