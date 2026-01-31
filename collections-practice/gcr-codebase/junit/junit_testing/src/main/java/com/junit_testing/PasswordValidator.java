package com.junit_testing;

public class PasswordValidator {

    public boolean isValidPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpperCase = true;
            }

            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }

        if (hasUpperCase && hasDigit) {
            return true;
        }

        return false;
    }
}
