package com.junit_testing;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ArithmeticExceptionCheckTest {

	ArithmeticExceptionCheck ae = new ArithmeticExceptionCheck();

	@Test
    void testDivideByZero() {
        try {
            ae.divide(10, 0);
            // if no exception, test should fail
            fail("Exception not thrown");
        } catch (ArithmeticException e) {
            // exception caught → test passes
        }
    }
}
