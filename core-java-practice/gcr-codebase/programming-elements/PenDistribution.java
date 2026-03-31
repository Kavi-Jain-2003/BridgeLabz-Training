//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also,find the remining non-distributed pens.

public class PenDistribution
{
    public static void main(String[] args)
	{
		//initialising variables
	    int pens=14;
		int students=3;
		//calculating to divide equally and to find remaining ones
		int equalPensToBeDivided=pens/students;
		int remainingPens=pens%students;
		//displaying output
		System.out.println("The Pen Per Student is "+equalPensToBeDivided+" and the remaining pen not distributed is "+remainingPens);		
	}
}