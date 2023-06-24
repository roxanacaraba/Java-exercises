package com.nagarro.remotelearning;

import org.apache.commons.text.WordUtils;
import java.util.ArrayList;
import java.util.List;


public class StringTitlelizer implements Titlelizer {

    List<String> ignoredWords = new ArrayList<>();

    @Override
    public String titlelize(String toTitlelize) throws IllegalArgumentException {
        if (toTitlelize == null) {
            throw new IllegalArgumentException("The string is null");
        }

        ignoredWords.add("The ");
        ignoredWords.add("A ");
        ignoredWords.add("To ");
        ignoredWords.add("Of ");

        String titlelizedString=  WordUtils.capitalizeFully(toTitlelize, ' ', ',', '.', '-', '?', '!');

        for (String element:ignoredWords) {
            titlelizedString = titlelizedString.replace(element, element.toLowerCase());
        }
        return titlelizedString;
    }
}
