package com.nagarro.remotelearning;

import java.util.regex.Pattern;

public class EmailValidation {
    public boolean emailIsValid(String email) {
        return Pattern.matches("[^@]+@{1}[^@]+\\.[a-z]{2,3}", email);
    }
}
