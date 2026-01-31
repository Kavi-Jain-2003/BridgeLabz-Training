package com.junit_testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(db.isConnected());
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}
