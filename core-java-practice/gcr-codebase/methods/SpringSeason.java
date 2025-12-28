//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 

public class SpringSeason {
	public static void main(String[] args) {
		// Take input from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
		boolean isSpring=isThisSpringSeason(month,day);
		// Output result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
	}

	//check whether this month has spring season
	public static boolean isThisSpringSeason(int month,int day)
	{
        // Check Spring Season condition
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }
		return false;
	}
}
