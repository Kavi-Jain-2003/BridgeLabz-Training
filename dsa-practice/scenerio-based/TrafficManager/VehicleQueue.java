/* Queue for waiting vehicles */
class VehicleQueue {

    private VehicleNode[] queue;
    private int front, rear, size, capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new VehicleNode[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(VehicleNode vehicle) {

        if (isFull()) {
            System.out.println("Queue Overflow: Waiting queue is full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = vehicle;
        size++;

        System.out.println("Vehicle added to waiting queue");
    }

    VehicleNode dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow: No waiting vehicles");
            return null;
        }

        VehicleNode vehicle = queue[front];
        size--;

        if (size == 0) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        return vehicle;
    }
}
