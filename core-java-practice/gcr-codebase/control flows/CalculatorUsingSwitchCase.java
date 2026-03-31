//Write a program to create a calculator using switch...case.

import java.util.Scanner;

public class CalculatorUsingSwitchCase {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value 
	  System.out.println("Enter first number:");
	  Double first=input.nextDouble();
	  System.out.println("Enter second number:");
	  Double second=input.nextDouble();
	  System.out.println("choose op from this + - * /");
	  char op = input.next().charAt(0);
	  //switchcase and prnting calculation result
        switch (op) {
            case '+':
                System.out.println("Result = " + (first + second));
                break;

            case '-':
                System.out.println("Result = " + (first - second));
                break;

            case '*':
                System.out.println("Result = " + (first * second));
                break;

            case '/':
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        // Close input
        input.close();
    }
}

