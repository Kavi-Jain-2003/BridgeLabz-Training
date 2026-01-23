import java.time.LocalDate;
import java.util.*;

class Policy implements Comparable<Policy> {

    int policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(int policyNumber, String policyHolderName,
                  LocalDate expiryDate, String coverageType,
                  double premiumAmount) {

        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // TreeSet sorting (by expiry date)
    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    // Uniqueness based on policy number
    @Override
    public boolean equals(Object o) {
        Policy p = (Policy) o;
        return this.policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return policyNumber;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " +
                expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}

public class PolicyManager {

    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    // Add policy to all sets
    void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // 1. Display all unique policies
    void displayAll() {
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    // 2. Policies expiring in next 30 days
    void expiringSoon() {
        LocalDate limit = LocalDate.now().plusDays(30);
        for (Policy p : treeSet) {
            if (!p.expiryDate.isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    // 3. Policies by coverage type
    void byCoverage(String coverage) {
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }
    }

    // 4. Find duplicate policy numbers
    void findDuplicates(List<Policy> list) {
        Set<Integer> seen = new HashSet<>();
        for (Policy p : list) {
            if (!seen.add(p.policyNumber)) {
                System.out.println("Duplicate: " + p);
            }
        }
    }

    // 5. Performance comparison
    void performanceTest(Set<Policy> set, Policy p) {

        long start, end;

        start = System.nanoTime();
        set.add(p);
        end = System.nanoTime();
        System.out.println("Add time: " + (end - start));

        start = System.nanoTime();
        set.contains(p);
        end = System.nanoTime();
        System.out.println("Search time: " + (end - start));

        start = System.nanoTime();
        set.remove(p);
        end = System.nanoTime();
        System.out.println("Remove time: " + (end - start));
    }


    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy(101, "Amit",
                LocalDate.now().plusDays(10), "Health", 5000);

        Policy p2 = new Policy(102, "Neha",
                LocalDate.now().plusDays(40), "Auto", 8000);

        Policy p3 = new Policy(103, "Rahul",
                LocalDate.now().plusDays(20), "Home", 12000);

        Policy p4 = new Policy(101, "Duplicate",
                LocalDate.now().plusDays(10), "Health", 5000);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4); // duplicate

        System.out.println("\nAll Policies:");
        manager.displayAll();

        System.out.println("\nExpiring Soon:");
        manager.expiringSoon();

        System.out.println("\nHealth Policies:");
        manager.byCoverage("Health");

        System.out.println("\nDuplicate Check:");
        manager.findDuplicates(Arrays.asList(p1, p2, p3, p4));

        System.out.println("\nPerformance Comparison:");
        manager.performanceTest(new HashSet<>(), p1);
        manager.performanceTest(new LinkedHashSet<>(), p1);
        manager.performanceTest(new TreeSet<>(), p1);
    }
}
