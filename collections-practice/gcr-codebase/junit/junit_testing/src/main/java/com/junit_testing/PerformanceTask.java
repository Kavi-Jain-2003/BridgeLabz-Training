package com.junit_testing;

public class PerformanceTask {

    public String longRunningTask() throws InterruptedException {
        // Sleep for 3 seconds
        Thread.sleep(3000);
        return "Task Completed";
    }
}
