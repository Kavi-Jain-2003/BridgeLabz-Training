import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineUsingFileReader {
    public static void main(String[] args) {

        String filePath = "sample.txt";

        try {
            // Create FileReader
            FileReader fr = new FileReader(filePath);

            // Wrap with BufferedReader
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
