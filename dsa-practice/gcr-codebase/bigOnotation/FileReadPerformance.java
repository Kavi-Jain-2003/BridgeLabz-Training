import java.io.*;

public class FileReadPerformance {

    public static void main(String[] args) {

        String filePath = "largefile.txt";
        long timeFR=0;
        long timeISR=0;

        // FileReader
        try {
            long startFR = System.nanoTime();

            FileReader fr = new FileReader(filePath);
            int ch;
            while ((ch = fr.read()) != -1) {
                // reading character by character
            }
            fr.close();

            long endFR = System.nanoTime();
            timeFR = endFR - startFR;
            System.out.println("FileReader Time: " + timeFR + " ns");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // InputStreamReader
        try {
            long startISR = System.nanoTime();

            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis);
            int ch;
            while ((ch = isr.read()) != -1) {
                // reading character by character
            }
            isr.close();

            long endISR = System.nanoTime();
           timeISR = endISR - startISR;
            System.out.println("InputStreamReader Time: " + timeISR + " ns");

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (timeFR < timeISR) {
            System.out.println("file reader takes less time");
        } else {
            System.out.println("input stream reader takes less time");
        }
    }
}
