import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;

public class ReadUserInputAndWriteToFileUsingInputStreamReader {
    public static void main(String[] args) {

        try {
            // Read input from keyboard
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Write data to file
            FileWriter fw = new FileWriter("output.txt");

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (true) {
                input = br.readLine();

                if (input.equals("exit")) {
                    break;
                }

                fw.write(input + "\n");
            }

            fw.close();
            System.out.println("Data saved to file successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
