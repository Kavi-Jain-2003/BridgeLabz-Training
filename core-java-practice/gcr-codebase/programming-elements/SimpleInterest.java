//Write a program to calculate simple interest using the formula:
//importing scanner class
import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String[] args)
	{
		//creating scnner object
	    Scanner input=new Scanner(System.in);
		//taking inputs from user
		int principal=input.nextInt();
		int rate=input.nextInt();
		int time=input.nextInt();
		
		//calculating SI
        double SI=(principal*rate*time)/100;
		//display result
		System.out.println("Simple Interest is "+SI);
		//closing input
		input.close();
	}
}
	