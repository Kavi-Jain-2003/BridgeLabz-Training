import java.util.*;

public class InvertMapExample {

    public static void main(String[] args) {

        // Original Map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Inverted Map
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        // Invert logic
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            // If value not present, create new list
            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }

            // Add key to the list
            invertedMap.get(value).add(key);
        }

        // Output
        System.out.println(invertedMap);
    }
}
