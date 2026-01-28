import java.util.Arrays;
import java.util.Scanner;
public class RankSheet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of students:");
		int n=sc.nextInt();
		int[] marks=new int[n];
		System.out.println("enter students marks:");
		for(int i=0; i<n; i++)
		{
			marks[i]=sc.nextInt();
		}
		
		mergeSort(marks);
		System.out.println("final list of marks:" + Arrays.toString(marks));
		sc.close();
	}

	public static void mergeSort(int[] arr) {
		int n = arr.length;
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			leftArr[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			rightArr[i - mid] = arr[i];
		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(arr, leftArr, rightArr);

	}

	public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int i = 0, j = 0, k = 0;
		int leftLen = leftArr.length;
		int rightLen = rightArr.length;
		while (i < leftLen && j < rightLen) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k++] = leftArr[i++];
			} else {
				arr[k++] = rightArr[j++];
			}
		}
		while (i < leftLen) {
			arr[k++] = leftArr[i++];
		}
		while (j < rightLen) {
			arr[k++] = rightArr[j++];
		}
	}
}