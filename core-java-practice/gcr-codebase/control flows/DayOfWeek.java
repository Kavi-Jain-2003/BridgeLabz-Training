//Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. 

import java.util.Scanner;

public class DayOfWeek {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value 
	  System.out.println("enter 1 for jan 2 for feb and so on");
	  int m=Integer.parseInt(args[0]);
	  System.out.println("enter 0 for sunday 1 for mon and so on");
	  int d=Integer.parseInt(args[1]);
	  int y=Integer.parseInt(args[2]);
	  int y0=y-(14-m)/12;
	  int x=y0+y0/4-y0/100+y0/400;
      int m0=m+12*((14-m)/12)-2;
      int d0=(d+x+31*m0/12)% 7;
       System.out.println(d0);	  
        // Close input
        input.close();
    }
}

