package com.nagarro.remotelearning.bubblesort;

import java.lang.reflect.Field;
import java.util.List;

public class BubbleSort<T> implements SortStrategy<T> {
    @Override
    public List<T> sort(List<T> list, String field) {
        int sizeOfArraylist = list.size();
        while (sizeOfArraylist > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < sizeOfArraylist; currentIndex++) {
                if (0 < customCompare(list.get(currentIndex - 1), list.get(currentIndex), field)) {
                    T temp = list.get(currentIndex - 1);
                    list.set(currentIndex - 1, list.get(currentIndex));
                    list.set(currentIndex, temp);
                    lastModifiedIndex = currentIndex;
                }
            }
            sizeOfArraylist = lastModifiedIndex;
        }
        return list;
    }

    public int customCompare(T object1, T object2, String field) throws InvalidFieldException {
        Class<?> classObject1 = object1.getClass();
        Class<?> classObject2 = object2.getClass();
        try {
            Field fieldObject1 = classObject1.getDeclaredField(field);
            Field fieldObject2 = classObject2.getDeclaredField(field);

            // Check if setAccessible() modification is persistent or if it needs to be set false after usage
            fieldObject1.setAccessible(true);
            fieldObject2.setAccessible(true);
            Comparable<T> valueOfFieldObject1 = (Comparable<T>) fieldObject1.get(object1);
            Comparable<T> valueOfFieldObject2 = (Comparable<T>) fieldObject2.get(object2);

            return valueOfFieldObject1.compareTo((T) valueOfFieldObject2);
        }
        catch (Exception e) {
            throw new InvalidFieldException("This field cannot be accessed.");
        }
    }
}
