package com.userregistration;

import com.userregistration.com.userregistration.InvalidUserDetailException;

import java.util.regex.Pattern;

public class UserRegistration {

    // first name validation
    public static boolean firstName(String firstName) {
        try {
            if (firstName.isEmpty())
                throw new InvalidUserDetailException("first name cant be empty");
        } catch (Exception e) {

        }

        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
    }

    // last name validation
    public static boolean lastName(String lastName) {
        try {
            if (lastName == null)
                throw new InvalidUserDetailException("last name cant be null");
        } catch (Exception e) {

        }
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
    }

    // email validation
    public static boolean email(String email) {
        try {
            if (email == null)
                throw new InvalidUserDetailException("email cant be null");
        } catch (Exception e) {
        }
        return Pattern.matches("^[a-zA-Z0-9]+[._+-]?[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2,4})?$", email);
    }

    // mobile number validation
    public static boolean mobile(String mobile) {
        try {
            if (mobile == null)
                throw new InvalidUserDetailException("mobile number cant be null");
        } catch (Exception e) {
        }
        return Pattern.matches("^[1-9]{2,3}(\\s)?[6-9]{1}[0-9]{9}$", mobile);
    }

    // password validation
    public static boolean pass(String pass) {
        try {
            if (pass == null)
                throw new InvalidUserDetailException("password number cant be null");
        } catch (Exception e) {
        }
        return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$", pass);
    }


}
