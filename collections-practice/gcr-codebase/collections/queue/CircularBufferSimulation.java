public class CircularBufferSimulation {

    int[] buffer;
    int size;
    int front = 0;
    int rear = 0;
    int count = 0;

    CircularBufferSimulation(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Insert element
    public void insert(int value) {

        buffer[rear] = value;
        rear = (rear + 1) % size;

        if (count == size) {
            // Buffer full → overwrite oldest
            front = (front + 1) % size;
        } else {
            count++;
        }
    }

    // Display buffer
    public void display() {

        System.out.print("Buffer: [ ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        CircularBufferSimulation cb = new CircularBufferSimulation(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);   // overwrites 1
        cb.display();
    }
}
