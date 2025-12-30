//Line Comparison problem

//importing scanner class
import java.util.Scanner;

public class LineComparisonProblem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("two lines comparison:");
		// line1
		System.out.println("first line");
		System.out.println("Enter coordinates for first point:");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		System.out.println("Enter coordinates for second point:");
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		// line2
		System.out.println("second line:");
		System.out.println("Enter coordinates for first point:");
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		System.out.println("Enter coordinates for second point:");
		int x4 = input.nextInt();
		int y4 = input.nextInt();
		double lengthOfFirstLine = length(x1, y1, x2, y2);
		double lengthOfSecondLine = length(x3, y3, x4, y4);
		System.out.println("Length Of first line is:" + lengthOfFirstLine);
		System.out.println("Length Of second line is:" + lengthOfSecondLine);
		// usecase2
		boolean isEqual = isBothLinesEqual(lengthOfFirstLine, lengthOfSecondLine);
		if (isEqual) {
			System.out.println("Both lines are equal");
		} else {
			System.out.println("Both lines are not equal");
		}
		// usecase3
		String greaterOrLesser = isGreaterOrLesser(lengthOfFirstLine, lengthOfSecondLine);
		System.out.println(greaterOrLesser);
		// closing input
		input.close();
	}

	// use case1
	public static double length(int x1, int y1, int x2, int y2) {
		double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return length;
	}

	// use case2
	public static boolean isBothLinesEqual(double lengthOfFirstLine, double lengthOfSecondLine) {
		return Double.compare(lengthOfFirstLine, lengthOfSecondLine) == 0;
	}

	// use case3
	public static String isGreaterOrLesser(double lengthOfFirstLine, double lengthOfSecondLine) {
		if (lengthOfFirstLine < lengthOfSecondLine) {
			return "Line2 is greater than line1";
		}
		return "Line 1 is greater than line 2";
	}

}
