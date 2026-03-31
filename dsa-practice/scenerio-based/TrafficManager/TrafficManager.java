/* Traffic Manager Logic */
class TrafficManager {

    private VehicleNode head = null;
    private VehicleNode tail = null;

    private int roundaboutCapacity = 3;
    private int currentSize = 0;

    private VehicleQueue waitingQueue = new VehicleQueue(5);

    /* Add vehicle */
    void addVehicle(int vehicleId, String vehicleType) {

        VehicleNode vnode = new VehicleNode(vehicleId, vehicleType);

        if (currentSize == roundaboutCapacity) {
            waitingQueue.enqueue(vnode);
            return;
        }

        if (head == null) {
            head = tail = vnode;
            vnode.next = head;
        } else {
            tail.next = vnode;
            vnode.next = head;
            tail = vnode;
        }

        currentSize++;
        System.out.println("Vehicle entered roundabout successfully");
    }

    /* Remove vehicle */
    void removeVehicle(int vehicleId) {

        if (head == null) {
            System.out.println("Underflow: No vehicles in roundabout");
            return;
        }

        // single vehicle
        if (head == tail && head.vehicleId == vehicleId) {
            head = tail = null;
            currentSize--;
            System.out.println("Vehicle removed");
            addFromQueue();
            return;
        }

        // remove head
        if (head.vehicleId == vehicleId) {
            head = head.next;
            tail.next = head;
            currentSize--;
            System.out.println("Vehicle removed");
            addFromQueue();
            return;
        }

        VehicleNode temp = head;
        do {
            if (temp.next.vehicleId == vehicleId) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                currentSize--;
                System.out.println("Vehicle removed");
                addFromQueue();
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Such vehicle is not present");
    }

    /* Move vehicle from queue to roundabout */
    private void addFromQueue() {
        VehicleNode vehicle = waitingQueue.dequeue();
        if (vehicle != null) {
            addVehicle(vehicle.vehicleId, vehicle.vehicleType);
        }
    }

    /* Display vehicles */
    void displayAllVehicles() {

        if (head == null) {
            System.out.println("No vehicle in roundabout");
            return;
        }

        VehicleNode temp = head;
        System.out.println("Vehicles in Roundabout:");

        do {
            System.out.println(temp.vehicleId + " | " + temp.vehicleType);
            temp = temp.next;
        } while (temp != head);
    }
}
