import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> reversedList = new ArrayList<>();

        // Loop from last index to first
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println("Original List: " + list);
        System.out.println("Reversed List: " + reversedList);
    }
}
