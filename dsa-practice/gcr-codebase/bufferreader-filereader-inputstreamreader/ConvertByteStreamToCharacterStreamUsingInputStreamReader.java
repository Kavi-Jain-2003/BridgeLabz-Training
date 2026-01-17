import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ConvertByteStreamToCharacterStreamUsingInputStreamReader {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("sample.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
