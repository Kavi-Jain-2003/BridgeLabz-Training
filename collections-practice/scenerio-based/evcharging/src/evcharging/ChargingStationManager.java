package evcharging;

import java.util.*;

public class ChargingStationManager {

    private Map<Integer, ChargingSlot> slotMap = new HashMap<>();
    private Queue<Vehicle> waitingQueue = new LinkedList<>();
    private PricingStrategy pricingStrategy;

    public ChargingStationManager(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void addSlot(ChargingSlot slot) {
        slotMap.put(slot.getSlotId(), slot);
    }

    public void assignVehicle(Vehicle vehicle)
            throws NoChargingSlotAvailableException {

        for (ChargingSlot slot : slotMap.values()) {
            if (!slot.isOccupied()) {

                slot.occupy();

                double bill = pricingStrategy
                        .calculateBill(vehicle.getUnitsConsumed());

                System.out.println(vehicle.getVehicleNumber() +
                        " charged at Slot " + slot.getSlotId() +
                        " | Bill = ₹" + bill);
                return;
            }
        }

        waitingQueue.add(vehicle);
        throw new NoChargingSlotAvailableException(
                "No slot available. Vehicle added to waiting queue.");
    }
}
