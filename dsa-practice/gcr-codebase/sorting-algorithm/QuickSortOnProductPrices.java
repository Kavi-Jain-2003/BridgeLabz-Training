import java.util.Arrays;

public class QuickSortOnProductPrices {

    static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l;
        int j = h;

        while (i < j) {

            do {
                i++;
            } while (i < h && a[i] <= pivot);

            do {
                j--;
            } while (a[j] > pivot);

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;

        return j;
    }

    static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int j = partition(a, l, h);
            quickSort(a, l, j);
            quickSort(a, j + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        quickSort(arr, 0, arr.length); 
        System.out.println(Arrays.toString(arr));
    }
}
