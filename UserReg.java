package com.dummytest;

import java.util.regex.Pattern;
public class UserReg {
    private static final String FIRST_NAME="^[A-Z][A-Za-z]{2,}";

    public boolean validateFirstName(String firstName) {
        Pattern pattern=Pattern.compile(FIRST_NAME);
        return pattern.matcher(firstName).matches();
    }
}
