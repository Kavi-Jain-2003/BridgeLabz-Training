package com.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {

        boolean result = utils.isEven(number);

        // expected result
        if (number % 2 == 0) {
            assertEquals(true, result);
        } else {
            assertEquals(false, result);
        }
    }
}
