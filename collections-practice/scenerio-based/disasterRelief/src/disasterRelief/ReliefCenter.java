package disasterRelief;

import java.util.*;

class ReliefCenter {

    String centerName;
    HashMap<String, Integer> resources = new HashMap<>();

    public ReliefCenter(String centerName) {
        this.centerName = centerName;
    }

    // Add resource
    public void addResource(String item, int quantity) {
        resources.put(item, resources.getOrDefault(item, 0) + quantity);
    }

    // Allocate resource
    public void allocate(AreaRequest request)
            throws InsufficientResourceException {

        int available = resources.getOrDefault(request.item, 0);

        if (available < request.quantity) {
            throw new InsufficientResourceException(
                    "Not enough " + request.item + " for " + request.areaName);
        }

        resources.put(request.item, available - request.quantity);

        System.out.println("Allocated " + request.quantity + " "
                + request.item + " to " + request.areaName);
    }

    public void generateReport() {
        System.out.println("\nRemaining Resources at " + centerName);
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
