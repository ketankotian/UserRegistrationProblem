package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
    }
}
