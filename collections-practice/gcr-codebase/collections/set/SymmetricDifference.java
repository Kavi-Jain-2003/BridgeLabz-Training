import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Step 1: Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // Step 2: Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Step 3: Remove intersection from union
        union.removeAll(intersection);

        System.out.println("Symmetric Difference: " + union);
    }
}
