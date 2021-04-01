package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    // first name validation
    public static boolean firstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
    }

    // last name validation
    public static boolean lastName(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
    }
    
}
