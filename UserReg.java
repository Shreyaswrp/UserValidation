package com.dummytest;

import java.util.regex.Pattern;
public class UserReg {
    private static final String FIRST_NAME="^[A-Z][A-Za-z]{2,}";
    private static final String LAST_NAME="^[A-Z][A-Za-z]{2,}";
    private static final String EMAIL_PATTERN="^[0-9a-z]+[+_.-]?[0-9a-z]+[@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]+$";
    private static final String MOBILE_PATTERN="^[0-9]{2}[ ][0-9]{10}";
    private static final String PASSWORD_PATTERN1="^[A-Za-z0-9]{8,}";
    private static final String PASSWORD_PATTERN2="(?=.*[A-Z].*)[A-Za-z0-9]{8,}";
    private static final String PASSWORD_PATTERN3="(?=.*[A-Z].*)(?=.*[0-9].*)[A-Za-z0-9]{8,}";
    private static final String PASSWORD_PATTERN4="(?=.*[A-Z].*)(?=.*[0-9].*)([a-zA-Z0-9]{4,}[!@#$%^&*()_+][a-zA-Z0-9]{3,})";

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
    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern=Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(phoneNumber).matches();
    }
    public boolean validatePassword(String passsword) {
        Pattern pattern=Pattern.compile(PASSWORD_PATTERN4);
        return pattern.matcher(passsword).matches();
    }

}
