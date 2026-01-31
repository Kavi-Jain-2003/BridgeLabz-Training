package com.junit_testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class PerformanceTaskTest {

    PerformanceTask task = new PerformanceTask();

    @Test
    @Timeout(2)   // time in seconds
    void testLongRunningTask() throws InterruptedException {
        task.longRunningTask();
    }
}
