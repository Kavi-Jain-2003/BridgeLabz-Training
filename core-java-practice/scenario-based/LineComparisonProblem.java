//Line Comparison problem

//importing scanner class
import java.util.Scanner;

public class LineComparisonProblem {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter coordinates for two points:");
		System.out.println("Enter coordinates for first point:");
		int x1=input.nextInt();
		int y1=input.nextInt();
		System.out.println("Enter coordinates for second point:");
		int x2=input.nextInt();
		int y2=input.nextInt();
		int lengthOfLine=length(x1,y1,x2,y2);
		System.out.println("Length Of line is:"+lengthOfLine);        
        
		//closing input
		input.close();
	}
	//use case1
	public static int length(int x1,int y1, int x2, int y2)
	{
		int length=(int)(Math.sqrt((x2-x1)^2+(y2-y1)^2));
		return length;
	}
	

}
