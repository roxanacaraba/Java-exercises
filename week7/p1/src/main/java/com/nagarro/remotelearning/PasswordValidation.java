package com.nagarro.remotelearning;

import java.util.regex.Pattern;

public class PasswordValidation {
    public boolean passwordIsValid(String password) {
        return Pattern.matches(".*(?=.*[a-z]).*(?=.*[A-Z]).*(?=.*[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~])[a-zA-Z!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~].{10,}", password);
    }
}
