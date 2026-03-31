public class Agent {
    private String agentId;
    private String location;
    private boolean available;

    public Agent(String agentId, String location) {
        this.agentId = agentId;
        this.location = location;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignOrder() {
        available = false;
    }

    public void completeOrder() {
        available = true;
    }

    public String getLocation() {
        return location;
    }

    public String getAgentId() {
        return agentId;
    }

    @Override
    public String toString() {
        return agentId + " (" + location + ", available=" + available + ")";
    }
}
