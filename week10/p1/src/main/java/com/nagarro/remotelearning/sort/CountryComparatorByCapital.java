package com.nagarro.remotelearning.sort;

import com.nagarro.remotelearning.Country;

import java.util.Comparator;

public class CountryComparatorByCapital implements Comparator<Country>{
    @Override
    public int compare(Country country1, Country country2) {
        return country1.getCapital().compareTo(country2.getCapital());
    }
}