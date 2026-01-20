/* Vehicle Node for Circular Linked List */
class VehicleNode {
    int vehicleId;
    String vehicleType;
    VehicleNode next;

    VehicleNode(int vehicleId, String vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.next = null;
    }
}
