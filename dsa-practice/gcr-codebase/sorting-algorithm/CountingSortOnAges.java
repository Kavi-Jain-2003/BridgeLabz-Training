import java.util.Arrays;

public class CountingSortOnAges {

    public static void countingSort(int[] ages) {

        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // 1️⃣ Store frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // 2️⃣ Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // 3️⃣ Place elements into output array (stable)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

        // 4️⃣ Copy sorted data back
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {

        int[] studentAges = {15, 12, 18, 10, 14, 12, 16, 11};

        countingSort(studentAges);

        System.out.println("Sorted Student Ages:");
        System.out.println(Arrays.toString(studentAges));
    }
}
