//Create a program to display a calendar for a given month and year. 

//importing scanner class
import java.util.Scanner;

public class DisplayCalendar {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter year:");
		int year = input.nextInt();
		System.out.println("enter month:");
		int month = input.nextInt();
		
		String monthName=getMonthName(month);
		int daysInMonth=getDaysInMonth(month,year);
		int firstDay=getFirstDay(month,1,year);
		
		// Display calendar header
        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		  // First loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
		 // Second loop to print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

		// closing the input
		input.close();
	}
	public static String getMonthName(int month)
	{
		String[] months={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		return months[month-1];		
	}
	public static int getDaysInMonth(int month,int year)
	{
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2 && isLeapyeear(year))
		{
			return 29;
		}
		return days[month-1];
	}
	//leap year method
	public static boolean isLeapyeear(int year)
	{
		return (year%4==0 && year%100!=0)||(year%400==0);
	}
	//calculating according to gregorian calendar formulae
	public static int getFirstDay(int m, int d, int y)
	{
	
	  int y0=y-(14-m)/12;
	  int x=y0+y0/4-y0/100+y0/400;
      int m0=m+12*((14-m)/12)-2;
      int d0=(d+x+31*m0/12)% 7;
	  return d0;
	}
}

