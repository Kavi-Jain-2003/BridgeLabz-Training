//Write a new program similar to he program #6 but take user input for Student Fee and University Discount

import java.util.Scanner;
public class StudentFeeAfterDiscountWithInput
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    int fee=input.nextInt();
		double discountPercent=input.nextDouble();
		double discount=(fee*discountPercent)/100;
		double feeToSubmit=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feeToSubmit);	
		input.close();
	}
}
