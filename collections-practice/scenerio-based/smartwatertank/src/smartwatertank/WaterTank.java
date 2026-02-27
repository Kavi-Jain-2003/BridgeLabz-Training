package smartwatertank;

class WaterTank {

    private int tankId;
    private double capacity;
    private double currentLevel;

    public WaterTank(int tankId, double capacity, double currentLevel)
            throws InvalidWaterLevelException {

        if (currentLevel > capacity) {
            throw new InvalidWaterLevelException("Level exceeds capacity!");
        }

        this.tankId = tankId;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public int getTankId() {
        return tankId;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public double getUsagePercentage() {
        return (currentLevel / capacity) * 100;
    }

    public boolean isLow() {
        return getUsagePercentage() < 20;
    }

    @Override
    public String toString() {
        return "Tank ID: " + tankId +
               ", Level: " + currentLevel +
               ", Usage: " + getUsagePercentage() + "%";
    }
}
