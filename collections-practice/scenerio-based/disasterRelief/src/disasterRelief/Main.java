package disasterRelief;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Store centers
        Map<String, ReliefCenter> centerMap = new HashMap<>();

        ReliefCenter center = new ReliefCenter("Central Relief");
        center.addResource("Food", 100);
        center.addResource("Water", 200);
        center.addResource("MedicalKit", 50);

        centerMap.put("C1", center);

        // FIFO Queue of area requests
        Queue<AreaRequest> requestQueue = new LinkedList<>();

        requestQueue.add(new AreaRequest("Area1", "Food", 30));
        requestQueue.add(new AreaRequest("Area2", "Water", 150));
        requestQueue.add(new AreaRequest("Area3", "MedicalKit", 60)); // insufficient

        // Process requests FIFO
        while (!requestQueue.isEmpty()) {
            AreaRequest request = requestQueue.poll();

            try {
                center.allocate(request);
            } catch (InsufficientResourceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Report
        center.generateReport();
    }
}
