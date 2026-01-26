import java.io.*;

public class ReadLargeFile {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("largefile.txt"));

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error while closing file.");
            }
        }
    }
}
