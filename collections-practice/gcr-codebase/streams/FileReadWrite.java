import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Open source file
            fis = new FileInputStream("source.txt");

            // Create destination file (if not exists)
            fos = new FileOutputStream("destination.txt");

            int ch;

            // Read and write byte by byte
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Source file not found or error occurred.");
        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}
