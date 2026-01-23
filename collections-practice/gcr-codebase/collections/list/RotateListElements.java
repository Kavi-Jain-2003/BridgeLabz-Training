import java.util.*;

public class RotateListElements {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        int k = 2;  // number of rotations

        List<Integer> rotatedList = new ArrayList<>();

        // Step 1: add elements from k to end
        for (int i = k; i < list.size(); i++) {
            rotatedList.add(list.get(i));
        }

        // Step 2: add elements from 0 to k-1
        for (int i = 0; i < k; i++) {
            rotatedList.add(list.get(i));
        }

        System.out.println("Rotated List: " + rotatedList);
    }
}
