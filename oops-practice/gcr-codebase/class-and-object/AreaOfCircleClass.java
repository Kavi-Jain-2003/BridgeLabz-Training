//Program to Compute Area of a Circle Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle. 
class Circle {
    //attribute
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    public void display() {
        System.out.printf("Area of circle: %.4f%n", calculateArea());
        System.out.printf("Circumference of circle: %.4f%n", calculateCircumference());
    }
}


public class AreaOfCircleClass {
    public static void main(String[] args) {
        // Create Circle object with radius 2.5
        Circle c = new Circle(2.5);

        // Display area and circumference
        c.display();
    }
}
