package smartParking;

import java.util.*;

class ParkingManager {

    private Map<Integer, ParkingSlot> slotMap = new TreeMap<>(); // nearest slot first
    private Queue<Vehicle> waitingQueue = new LinkedList<>();

    public void addSlot(ParkingSlot slot) {
        slotMap.put(slot.getSlotId(), slot);
    }

    public void parkVehicle(Vehicle vehicle) {
        try {
            allocateSlot(vehicle);
        } catch (NoParkingSlotAvailableException e) {
            System.out.println("No slot available. Added to waiting queue.");
            waitingQueue.offer(vehicle);
        }
    }

    private void allocateSlot(Vehicle vehicle) throws NoParkingSlotAvailableException {
        for (ParkingSlot slot : slotMap.values()) { // nearest first
            if (slot.isAvailableFor(vehicle)) {
                slot.parkVehicle(vehicle);
                System.out.println(vehicle.getVehicleNumber() +
                        " parked at slot " + slot.getSlotId());
                return;
            }
        }
        throw new NoParkingSlotAvailableException("No slot available for " + vehicle.getType());
    }

    public void freeSlot(int slotId) {
        ParkingSlot slot = slotMap.get(slotId);
        if (slot != null && slot.isOccupied()) {
            slot.removeVehicle();
            System.out.println("Slot " + slotId + " is now free.");

            if (!waitingQueue.isEmpty()) {
                Vehicle nextVehicle = waitingQueue.poll();
                parkVehicle(nextVehicle);
            }
        }
    }
}
