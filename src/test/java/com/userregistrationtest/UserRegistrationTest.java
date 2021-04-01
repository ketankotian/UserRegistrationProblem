package com.userregistrationtest;

import com.userregistration.UserRegistration;
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

}
