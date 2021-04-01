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

    // email validation
    public static boolean email(String email) {
        return Pattern.matches("^[a-zA-Z0-9]+[._+-]?[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2,4})?$", email);
    }

    // mobile number validation
    public static boolean mobile(String mobile) {
        return Pattern.matches("^[1-9]{2,3}(\\s)?[6-9]{1}[0-9]{9}$", mobile);
    }

    // password validation
    public static boolean pass(String pass) {
        return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$", pass);
    }


}
