
//Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
//importing scanner class
import java.util.Scanner;

class CircleConstructor {
	// attributes
	double radius;

	// default constructor
	CircleConstructor() {
		this(7);
	} // parametrized constructor

	CircleConstructor(double radius) {
		this.radius = radius;
	}

	double areaOfCircle(Double radius) {
		return 3.14 * radius * radius;
	}

	// instance method
	void displayArea() {
		System.out.println("Radius of circle:" + radius);
		System.out.println("Area of circle:" + areaOfCircle(radius));

	}
	public static void main(String[] args) {

		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("Enter radius:");
		double radius = input.nextDouble();
		CircleConstructor c1 = new CircleConstructor();
		c1.displayArea();
		CircleConstructor c2 = new CircleConstructor(radius);
		c2.displayArea();
		// closing the input
		input.close();
	}
}
