package com.nagarro.remotelearning.sort;

import com.nagarro.remotelearning.Country;

import java.util.Comparator;

public class CountryComparatorByName implements Comparator<Country> {
    @Override
    public int compare(Country country1, Country country2) {
        return country1.getName().compareTo(country2.getName());
    }
}
