//Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().

public class RandomAvgArray {
	public static void main(String[] args) {
		int size = 5;

        // Generate 4-digit random numbers
        int[] numbers = generate4DigitRandomArray(size);

        // Display generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find average, min and max
        double[] result = findAverageMinMax(numbers);

        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + result[1]);
        System.out.println("Maximum = " + result[2]);
	}

	//Method to generate array of 4dgit random numbers
	public static int[] generate4DigitRandomArray(int size)
	{
		int[] arr= new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=(int)(Math.random()*9000)+1000;
		}
		return arr;
	}
	//method to find average,min and max
	public static double[] findAverageMinMax(int[] numbers)
	{
		int min=numbers[0];
		int max=numbers[1];
		int sum=0;
		for(int num:numbers)
		{
			sum+=num;
			min=Math.min(min,num);
			max=Math.max(max,num);
		}
		double average=(double)sum/numbers.length;
		return new double[]{average,min,max};
	}
}