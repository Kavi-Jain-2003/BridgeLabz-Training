import java.util.Scanner;
class MaxAndMin {
     // Method to find minimum and maximum
   public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter n elements:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        // Call method
        int[] result = findMinMax(arr);

        // Output
        System.out.println("Minimum element: " + result[0]);
        System.out.println("Maximum element: " + result[1]);

       
        sc.close();
    }
}
