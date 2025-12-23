//Write a new program similar to he program #6 but take user input for Student Fee and University Discount

//importing Scanner class
import java.util.Scanner;
public class StudentFeeAfterDiscountWithInput
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter fee:");
	    int fee=input.nextInt();
		//calculating discount and dicountedfee
		double discountPercent=input.nextDouble();
		double discount=(fee*discountPercent)/100;
		double feeToSubmit=fee-discount;
		//displaying output
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feeToSubmit);	
		//closing input
		input.close();
	}
}
