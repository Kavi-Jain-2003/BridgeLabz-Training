public class FirstNegativeLinearSearch {

    public static int findFirstNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;   // first negative found
            }
        }

        return -1;  // no negative number found
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 3, -7, 8, -2};

        int index = findFirstNegative(arr);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found");
        }
    }
}
