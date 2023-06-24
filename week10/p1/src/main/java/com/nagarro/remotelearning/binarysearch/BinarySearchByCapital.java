package com.nagarro.remotelearning.binarysearch;

import com.nagarro.remotelearning.Country;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchByCapital {

    public String binarySearchByCapital(List<Country> list,
                                        final String capital,
                                        Comparator<Country> comparatorByCapital) {
        list.sort(comparatorByCapital);
        int index = Collections.binarySearch(
                list,
                new Country(null, capital),
                comparatorByCapital);
        return list.get(index).getName();
    }
}
