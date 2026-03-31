import java.io.*;

public class UpperToLower {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Read from source file
            br = new BufferedReader(new FileReader("input.txt"));

            // Write to destination file
            bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;

            // Read line by line
            while ((line = br.readLine()) != null) {

                // Convert to lowercase
                line = line.toLowerCase();

                // Write to output file
                bw.write(line);
                bw.newLine();
            }

            System.out.println("File converted successfully!");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.out.println("Error while closing streams.");
            }
        }
    }
}
