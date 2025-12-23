// Maya’s BMI Fitness Tracker. Maya, a fitness coach, wants to record the BMI of her clients.
import java.util.Scanner;

public class BMIFitnessTracker {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
	  System.out.println("Enter height:");
	  double height = input.nextDouble();
	  System.out.println("Enter weight:");
      double weight = input.nextDouble();
	  //calculate bmi
	  double bmi=weight/(height*height);
	  String status="";
	  //setting status according to bmi
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

