import java.util.*;

public class DeliveryService {

    private Queue<Order> orderQueue = new LinkedList<>();
    private List<Agent> agents = new ArrayList<>();
    private Map<Order, Agent> activeDeliveries = new HashMap<>();

    // Add order
    public void addOrder(Order order) {
        orderQueue.offer(order);
    }

    // Add agent
    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    // Assign orders FIFO to nearest available agent
    public void assignOrder() throws NoAgentAvailableException {

        if (orderQueue.isEmpty()) {
            System.out.println("No orders to assign");
            return;
        }

        Order order = orderQueue.poll();
        Agent selectedAgent = null;

        for (Agent agent : agents) {
            if (agent.isAvailable()) {
                selectedAgent = agent; // simplified “nearest”
                break;
            }
        }

        if (selectedAgent == null) {
            throw new NoAgentAvailableException("No delivery agent available");
        }

        selectedAgent.assignOrder();
        activeDeliveries.put(order, selectedAgent);

        System.out.println("Order " + order + " assigned to Agent " + selectedAgent.getAgentId());
    }

    // Cancel order
    public void cancelOrder(Order order) {
        Agent agent = activeDeliveries.remove(order);

        if (agent != null) {
            agent.completeOrder();
            System.out.println("Order cancelled: " + order);
        }
    }

    // View active deliveries
    public void viewActiveDeliveries() {
        for (Map.Entry<Order, Agent> entry : activeDeliveries.entrySet()) {
            System.out.println(
                "Order: " + entry.getKey() +
                " → Agent: " + entry.getValue().getAgentId()
            );
        }
    }
}
