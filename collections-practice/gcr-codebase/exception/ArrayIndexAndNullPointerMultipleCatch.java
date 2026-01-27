import java.util.Scanner;

public class ArrayIndexAndNullPointerMultipleCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 array elements:");
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index no. to get that value:");
        int index = sc.nextInt();

        try {
            if (arr == null) {
                throw new NullPointerException("The array is null");
                
            }

            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Index out of range");
            }

            System.out.println("Value at index " + index + " : " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is out of range");
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
