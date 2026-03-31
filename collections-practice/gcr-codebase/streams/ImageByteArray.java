import java.io.*;

public class ImageByteArray{

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Read image file
            fis = new FileInputStream("input.jpg");

            // Convert image to byte array
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int data;
            while ((data = fis.read()) != -1) {
                baos.write(data);
            }

            byte[] imageBytes = baos.toByteArray();

            // Write byte array back to new image file
            ByteArrayInputStream bais =
                    new ByteArrayInputStream(imageBytes);

            fos = new FileOutputStream("output.jpg");

            while ((data = bais.read()) != -1) {
                fos.write(data);
            }

            System.out.println("Image converted successfully!");

        } catch (IOException e) {
            System.out.println("Error while processing image.");
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}
