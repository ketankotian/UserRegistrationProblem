package com.userregistrationtest;

import com.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.firstName("Ketan");
        Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.lastName("Kotian");
        Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.email("abc.de@aol.com");
        Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.mobile("91 8655807478");
        Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.pass("@123Ketank");
        Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenEmpty_ShouldReturnFalse() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.firstName("");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenEmpty_ShouldReturnFalse() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.lastName("");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.mobile("");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenEmpty_ShouldReturnFalse() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.email("");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenEmpty_ShouldReturnFalse() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.pass("");
        Assertions.assertEquals(false, result);
    }

}
