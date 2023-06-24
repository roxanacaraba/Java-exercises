package com.nagarro.remotelearning;

import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public boolean phoneIsValid(String phoneNumber) {
        return Pattern.matches("^(\\+40*|0040*|0{1})[0-9 \\-\\(\\)\\.]{9}", phoneNumber);
    }
}
