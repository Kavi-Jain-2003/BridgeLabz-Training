package com.junit_testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor {

    // Write content to file
    public void writeToFile(String filename, String content) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

    // Read content from file
    public String readFromFile(String filename) throws IOException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        String data = "";
        while (sc.hasNextLine()) {
            data += sc.nextLine();
        }
        sc.close();
        return data;
    }
}
