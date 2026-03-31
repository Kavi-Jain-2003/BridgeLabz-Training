package com.junit_testing;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        registration.registerUser("pooja", "pooja@gmail.com", "secret1");
    }

    @Test
    void testInvalidUsername() {
        try {
            registration.registerUser("", "pooja@gmail.com", "secret1");
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            // Exception expected
        }
    }

    @Test
    void testInvalidEmail() {
        try {
            registration.registerUser("pooja", "poojagmail.com", "secret1");
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            // Exception expected
        }
    }

    @Test
    void testInvalidPassword() {
        try {
            registration.registerUser("pooja", "pooja@gmail.com", "123");
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            // Exception expected
        }
    }
}
