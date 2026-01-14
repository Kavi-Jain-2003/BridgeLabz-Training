import java.util.LinkedList;

class BasicHashMapOperations {
    // Define the size of the hash table
    private final int SIZE = 1000;
    
    // Array of LinkedLists to handle collisions
    private LinkedList<Node>[] table;

    // Node class to store key-value pairs
    private static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public MyHashMap() {
        table = new LinkedList[SIZE];
    }

    // Hash function to get index
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert or update key-value pair
    public void put(int key, int value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Check if key already exists, then update
        for (Node node : table[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        // Key not found, insert new node
        table[index].add(new Node(key, value));
    }

    // Retrieve value by key
    public int get(int key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Node node : table[index]) {
                if (node.key == key) {
                    return node.value;
                }
            }
        }
        return -1; // Key not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = hash(key);
        if (table[index] != null) {
            Node toRemove = null;
            for (Node node : table[index]) {
                if (node.key == key) {
                    toRemove = node;
                    break;
                }
            }
            if (toRemove != null) {
                table[index].remove(toRemove);
            }
        }
    }
}

public class CustomHashMapDemo {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        
        map.put(1, 10);
        map.put(2, 20);
        map.put(1021, 30); // collision example (1021 % 1000 = 21)

        System.out.println("Value for key 1: " + map.get(1)); // 10
        System.out.println("Value for key 2: " + map.get(2)); // 20
        System.out.println("Value for key 1021: " + map.get(1021)); // 30

        map.remove(2);
        System.out.println("Value for key 2 after removal: " + map.get(2)); // -1
    }
}
