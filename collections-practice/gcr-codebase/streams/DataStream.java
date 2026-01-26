import java.io.*;

public class DataStream {

    public static void main(String[] args) {

        // Writing data
        try {
            DataOutputStream dos =
                    new DataOutputStream(new FileOutputStream("student.dat"));

            dos.writeInt(101);                 // Roll number
            dos.writeUTF("Kavi Jain");         // Name
            dos.writeDouble(8.5);              // GPA

            dos.close();
            System.out.println("Student data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error while writing data.");
        }

        // Reading data
        try {
            DataInputStream dis =
                    new DataInputStream(new FileInputStream("student.dat"));

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            dis.close();

            System.out.println("\nStudent Details:");
            System.out.println("Roll No: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading data.");
        }
    }
}
