package smartwatertank;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<WaterTank> tankList = new ArrayList<>();

        try {
            tankList.add(new WaterTank(1, 1000, 900));
            tankList.add(new WaterTank(2, 1000, 150)); // Low
            tankList.add(new WaterTank(3, 1000, 500));
        }
        catch (InvalidWaterLevelException e) {
            System.out.println(e.getMessage());
        }

        // Alert check
        for (WaterTank tank : tankList) {
            if (tank.isLow()) {
                System.out.println("⚠ Alert! Tank " + tank.getTankId() + " below 20%");
            }
        }

        // Sort by lowest level
        Collections.sort(tankList, new Comparator<WaterTank>() {
            public int compare(WaterTank t1, WaterTank t2) {
                return Double.compare(t1.getCurrentLevel(), t2.getCurrentLevel());
            }
        });

        System.out.println("\nAfter Sorting (Lowest First):");
        for (WaterTank tank : tankList) {
            System.out.println(tank);
        }
    }
}
