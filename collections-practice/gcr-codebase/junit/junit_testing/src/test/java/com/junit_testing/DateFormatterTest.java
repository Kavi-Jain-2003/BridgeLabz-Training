package com.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        String result = formatter.formatDate("2024-01-31");
        assertEquals("31-01-2024", result);
    }

    @Test
    void testInvalidDate() {
        String result = formatter.formatDate("2024-31-01");
        assertEquals("Invalid Date", result);
    }
}
