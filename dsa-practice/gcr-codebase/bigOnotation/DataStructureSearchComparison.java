import java.util.*;

public class DataStructureSearchComparison {

    // Linear Search in Array
    public static boolean arraySearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int size = 1_000_000; 
        int range = 2_000_000;

        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random random = new Random();

        // Insert Data
        for (int i = 0; i < size; i++) {
            int value = random.nextInt(range);
            array[i] = value;
            hashSet.add(value);
            treeSet.add(value);
        }

        // Random search element
        int target = array[random.nextInt(size)];

        System.out.println("Dataset Size: " + size);
        System.out.println("Search Element: " + target);

        // Array Search
        long startArray = System.nanoTime();
        boolean arrayFound = arraySearch(array, target);
        long endArray = System.nanoTime();
        long arraySearchTime=(endArray - startArray);

        // HashSet Search
        long startHashSet = System.nanoTime();
        boolean hashSetFound = hashSet.contains(target);
        long endHashSet = System.nanoTime();
        long hashSetSearchTime=(endHashSet - startHashSet);

        // TreeSet Search
        long startTreeSet = System.nanoTime();
        boolean treeSetFound = treeSet.contains(target);
        long endTreeSet = System.nanoTime();
        long treeSetSearchTime=(endTreeSet - startTreeSet);

        // Results
        System.out.println("\n--- Search Performance Comparison ---");

        System.out.println("Array Search Found    : " + arrayFound);
        System.out.println("Array Search Time    : "
                +arraySearchTime  + " ns");

        System.out.println("\nHashSet Search Found : " + hashSetFound);
        System.out.println("HashSet Search Time  : "
                + hashSetSearchTime+ " ns");

        System.out.println("\nTreeSet Search Found : " + treeSetFound);
        System.out.println("TreeSet Search Time  : "
                + treeSetSearchTime + " ns");
        if(arraySearchTime<hashSetSearchTime && arraySearchTime<treeSetSearchTime)
        {
            System.out.println("Array takes less time in searching");
        }
        else if(hashSetSearchTime<treeSetSearchTime && hashSetSearchTime<arraySearchTime)
        {
            System.out.println("Hashset takes less time in searching");
        }
        else
        {
            System.out.println("Treeset takes less time in searching");
        }
        sc.close();
    }
}
