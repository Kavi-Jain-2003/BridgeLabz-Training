package com.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        double result = converter.celsiusToFahrenheit(0);
        assertEquals(32, result);
    }

    @Test
    void testFahrenheitToCelsius() {
        double result = converter.fahrenheitToCelsius(32);
        assertEquals(0, result);
    }
}
