// Sandeep’s Fitness Challenge Tracker
//importing scanner class
import java.util.Scanner;

public class FitnessChallengeTracker {

	public static void main(String[] args) {

		// creating scanner object
		Scanner input = new Scanner(System.in);
		//user input
		System.out.println("Enter count of pushups done in a week and for restday insert -1");
		int[] count=new int[7];
		for(int i=0; i<7; i++)
		{
			count[i]=input.nextInt();
		}
		int pushupTotal=pushupTotalForWeek(count);
		double pushupAverage=pushupAverageForWeek(count,pushupTotal);
		System.out.println("total pushups in a week:"+pushupTotal);
		System.out.println("average pushups in a week:"+pushupAverage);
		// closing input
		input.close();
	}
	//total pushups in a week
	public static int pushupTotalForWeek(int[] count)
	{
		int sum=0;
		for(int i=0; i<count.length; i++)
		{
			if(count[i]==-1)
			{
				continue;
			}
			sum+=count[i];			
		}
		return sum;
	}
	//average of pushups
	public static double pushupAverageForWeek(int[] count,int pushupTotal)
	{
		int restday=0;
		for(int i=0; i<count.length; i++)
		{
			if(count[i]==-1)
			{
				restday++;
			}
		}
		double avg=pushupTotal/(count.length-restday);
		return avg;
	}

	
}
