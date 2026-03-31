import java.util.*;

public class FindNthElement {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;

        // Two pointers using indices
        int first = 0;
        int second = 0;

        // Move first pointer N steps ahead
        for (int i = 0; i < N; i++) {
            first++;
        }

        // Move both until first reaches end
        while (first < list.size()) {
            first++;
            second++;
        }

        System.out.println("Nth element from end: " + list.get(second));
    }
}
