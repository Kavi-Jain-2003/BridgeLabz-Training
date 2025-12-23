//Create a program to find the BMI of a person
import java.util.Scanner;

public class BMI {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
      double weight = input.nextDouble();
	  double height = input.nextDouble();
	  double bmi=weight/(height*height);
	  String status="";
	  if(bmi<=18.4)
	  {
	      status="Underweight";
	  }
	  else if(bmi>=18.5 && bmi<=24.9)
	  {
	      status="Normal";
	  }
	  else if(bmi>=25.0 && bmi<=39.9)
	  {
	      status="Overweight";
	  }
	  else
	  {
	      status="Obese";
	  }
      // Print  
      System.out.println("The weight status of the person is:"+status);
	  //close input
      input.close();
   }
}

