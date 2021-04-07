package com.userregistrationtest.com.userregistrationtest;

import com.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String email;
    private boolean result;
    private UserRegistration validEmail;

    public ValidEmailTest(boolean result, String email) {
        super();
        this.result = result;
        this.email = email;

    }

    @Before
    public void initialize() {
        validEmail = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]
                {
                        {true, "abc@yahoo.com"},
                        {true, "abc-100@yahoo.com"},
                        {true, "abc.100@yahoo.com"},
                        {true, "abc111@abc.com"},
                        {true, "abc-100@abc.net"},
                        {true, "abc.100@abc.com.au"},
                        {true, "abc@1.com"},
                        {true, "abc@gmail.com.com"},
                        {true, "abc+100@gmail.com"},
                        {false, "abcgmail.com"},
                        {false, "abc@.com.my"},
                        {false, "abc.100@gmail.a"},
                        {false, "abc123@.com"},
                        {false, "abc123@.com.com"},
                        {false, ".abc@abc.com"},
                        {false, "abc()*@abc.com"},
                        {false, "abc@%*.com"},
                        {false, "abc..2002@gmail.com"},
                        {false, "abc.gamil.com"},
                        {false, "abc@abc@gmail.com"},
                        {false, "abc@gmail.com.1a"},
                        {false, "abc@gmail.com.aa.au"},
                });
    }

    @Test
    public void email() {
        System.out.println("Valid Email : " + result);
        Assert.assertEquals(result, UserRegistration.email(email));
    }
}
