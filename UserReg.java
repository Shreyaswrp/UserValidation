package com.dummytest;

import java.util.regex.Pattern;
public class UserReg {
    private static final String FIRST_NAME="^[A-Z][A-Za-z]{2,}";
    private static final String LAST_NAME="^[A-Z][A-Za-z]{2,}";
    private static final String EMAIL_PATTERN="^[0-9a-z]+[+_.-]?[0-9a-z]+[@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]+$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern=Pattern.compile(FIRST_NAME);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName(String lastName) {
        Pattern pattern=Pattern.compile(LAST_NAME);
        return pattern.matcher(lastName).matches();
    }
    public boolean validateEmailId(String emailid) {
        Pattern pattern=Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailid).matches();
    }
}
