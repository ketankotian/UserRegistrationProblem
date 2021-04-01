package com.userregistrationtest;

import com.userregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration fn = new UserRegistration();
        boolean result = UserRegistration.validateFirstName("Ketan");
        Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }

}
