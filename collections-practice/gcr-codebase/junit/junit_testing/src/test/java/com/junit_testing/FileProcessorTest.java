package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String filename = "testfile.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(filename, "Hello JUnit");

        String content = processor.readFromFile(filename);

        assertEquals("Hello JUnit", content);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        processor.writeToFile(filename, "File Test");

        File file = new File(filename);

        assertTrue(file.exists());
    }

    @Test
    void testReadFileThatDoesNotExist() {
        try {
            processor.readFromFile("nofile.txt");
            fail("IOException not thrown");
        } catch (IOException e) {
            // Exception expected → test passes
        }
    }
}
