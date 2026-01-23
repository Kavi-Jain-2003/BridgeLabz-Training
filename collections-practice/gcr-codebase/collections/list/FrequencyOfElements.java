import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "apple", "banana", "apple", "orange"
        );

        Map<String, Integer> freqMap = new HashMap<>();

        // Traverse the list
        for (String item : list) {

            // If key already exists, increase count
            if (freqMap.containsKey(item)) {
                freqMap.put(item, freqMap.get(item) + 1);
            }
            // If key does not exist, add with count 1
            else {
                freqMap.put(item, 1);
            }
        }

        System.out.println(freqMap);
    }
}
