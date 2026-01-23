import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Step 1: Convert Set to List
        List<Integer> list = new ArrayList<>(set);

        // Step 2: Sort the List
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}
