import java.io.*;

// Writer Thread
class WriterThread extends Thread {

    PipedOutputStream pos;

    WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from Writer Thread";

            // Write data
            pos.write(message.getBytes());
            pos.close();

        } catch (IOException e) {
            System.out.println("Error in writing data.");
        }
    }
}

// Reader Thread
class ReaderThread extends Thread {

    PipedInputStream pis;

    ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");

            // Read data
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }

            pis.close();

        } catch (IOException e) {
            System.out.println("Error in reading data.");
        }
    }
}

// Main class
public class PipedStream {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Create threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            // Start threads
            writer.start();
            reader.start();

        } catch (IOException e) {
            System.out.println("Pipe connection error.");
        }
    }
}
