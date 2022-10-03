package com.bridgeLabz;

import java.util.regex.Pattern;

public class UserRegistration {

    static  String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    static String EMAIL_PATTERN = "^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    static String PHONE= "^[0-9]{2}[0-9]{10}";

    public boolean validFirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean validLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean validPhone(String phone) {
        Pattern pattern = Pattern.compile(PHONE);
        return pattern.matcher(phone).matches();
    }

}
