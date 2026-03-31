package com.junit_testing;

public class UserRegistration {

    public void registerUser(String username, String email, String password) {

        if (username == null || username.length() == 0) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (email == null || email.length() == 0 || email.indexOf('@') == -1) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Invalid password");
        }

        // If all inputs are valid
        System.out.println("User registered successfully");
    }
}
