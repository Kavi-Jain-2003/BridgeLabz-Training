import java.io.*;

public class FileCopyComparison {

    public static void main(String[] args) {

        String sourceFile = "bigfile.txt";
        String normalCopy = "normalCopy.txt";
        String bufferedCopy = "bufferedCopy.txt";

        copyUsingNormalStream(sourceFile, normalCopy);
        copyUsingBufferedStream(sourceFile, bufferedCopy);
    }

    // Normal File Streams
    static void copyUsingNormalStream(String src, String dest) {
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);

            byte[] buffer = new byte[4096]; // 4 KB
            int bytesRead;

            long startTime = System.nanoTime();

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();

            System.out.println("Normal Stream Time: " 
                + (endTime - startTime) + " ns");

            fis.close();
            fos.close();

        } catch (IOException e) {
            System.out.println("Error in normal stream copy.");
        }
    }

    // Buffered Streams
    static void copyUsingBufferedStream(String src, String dest) {
        try {
            BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(dest));

            byte[] buffer = new byte[4096]; // 4 KB
            int bytesRead;

            long startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();

            System.out.println("Buffered Stream Time: " 
                + (endTime - startTime) + " ns");

            bis.close();
            bos.close();

        } catch (IOException e) {
            System.out.println("Error in buffered stream copy.");
        }
    }
}
