//The Universityis charging the student a fee of INR 125000 for the course. The Univesity is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course

public class StudentFeeAfterDiscount
{
    public static void main(String[] args)
	{
		//initialising variables
	    int fee=125000;
		double discountPercent=10;
		//calculating discount and discountedfee
		double discount=(fee*discountPercent)/100;
		double feeToSubmit=fee-discount;
		//displaying output
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feeToSubmit);	
	}
}
