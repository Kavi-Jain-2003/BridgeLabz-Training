import java.io.*;

public class PerformanceComparison {

    // Part 1: StringBuilder vs StringBuffer
    public static void stringConcatPerformance() {
        int n = 1_000_000;
        String str = "hello";

        // StringBuilder
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");

        // StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append(str);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");
    }

    // Part 2: FileReader vs InputStreamReader
    public static void fileReadPerformance(String filePath) {
        // FileReader
        try {
            long startTime = System.currentTimeMillis();
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            br.close();
            long endTime = System.currentTimeMillis();
            System.out.println("FileReader: Words = " + wordCount + ", Time = " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        // InputStreamReader
        try {
            long startTime = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            br.close();
            long endTime = System.currentTimeMillis();
            System.out.println("InputStreamReader: Words = " + wordCount + ", Time = " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Part 1: String concat performance
        System.out.println("===== StringBuilder vs StringBuffer =====");
        stringConcatPerformance();

        // Part 2: File reading performance
        System.out.println("\n===== FileReader vs InputStreamReader =====");
        String filePath = "largefile.txt"; // Provide your large file path
        fileReadPerformance(filePath);
    }
}
