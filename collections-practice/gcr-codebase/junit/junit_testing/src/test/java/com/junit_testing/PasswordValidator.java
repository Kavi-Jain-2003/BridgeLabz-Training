package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValidPassword("Password1"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(validator.isValidPassword("Pass1"));
    }

    @Test
    void testNoUpperCase() {
        assertFalse(validator.isValidPassword("password1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValidPassword("Password"));
    }
}
