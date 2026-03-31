import java.time.LocalDate;
import java.util.*;

class Policy {

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

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | "
                + expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}

public class PolicyManager {

    // Store policies
    HashMap<Integer, Policy> hashMap = new HashMap<>();
    LinkedHashMap<Integer, Policy> linkedHashMap = new LinkedHashMap<>();
    TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy p) {
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);

        // TreeMap sorted by expiryDate
        treeMap.putIfAbsent(p.expiryDate, new ArrayList<>());
        treeMap.get(p.expiryDate).add(p);
    }

    // Retrieve by policy number
    public Policy getPolicy(int policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List policies expiring in next 30 days
    public void expiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        System.out.println("Policies expiring in next 30 days:");
        for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.subMap(today, true, limit, true).entrySet()) {
            for (Policy p : entry.getValue()) {
                System.out.println(p);
            }
        }
    }

    // List policies by policyholder name
    public void policiesByHolder(String name) {
        System.out.println("Policies for " + name + ":");
        for (Policy p : hashMap.values()) {
            if (p.policyHolderName.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // Remove expired policies
    public void removeExpired() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<Integer, Policy>> it = hashMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Policy> entry = it.next();
            if (entry.getValue().expiryDate.isBefore(today)) {
                it.remove();
                linkedHashMap.remove(entry.getKey());
                treeMap.get(entry.getValue().expiryDate).remove(entry.getValue());
            }
        }
    }

    // Display all policies
    public void displayAll() {
        System.out.println("All policies (HashMap):");
        for (Policy p : hashMap.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy(101, "Amit", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(102, "Neha", LocalDate.now().plusDays(40), "Auto", 8000);
        Policy p3 = new Policy(103, "Rahul", LocalDate.now().plusDays(20), "Home", 12000);
        Policy p4 = new Policy(104, "Amit", LocalDate.now().minusDays(5), "Health", 4000); // expired

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        manager.displayAll();
        System.out.println();

        System.out.println("Retrieve by policy number 102:");
        System.out.println(manager.getPolicy(102));
        System.out.println();

        manager.expiringSoon();
        System.out.println();

        manager.policiesByHolder("Amit");
        System.out.println();

        manager.removeExpired();
        System.out.println("After removing expired policies:");
        manager.displayAll();
    }
}

