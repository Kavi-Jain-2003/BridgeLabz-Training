//Arrays – Temperature Analyzer  1. Scenario: You're analyzing a week’s worth of hourly temperature data stored in a 2D array(float[7][24]
//importing scanner class
import java.util.Scanner;

class TemperatureAnalyser {
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // user input
        System.out.println("Enter hourly temperature for a week:");
        float[][] temp = new float[7][24];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                temp[i][j] = input.nextFloat();
            }
        }
        hottestAndCoolestDay(temp);
        avgPerDay(temp);

        // closing input
        input.close();
    }

   // Find hottest and coldest day
    public static void hottestAndCoolestDay(float[][] temp) {

        float hottestAvg = Float.MIN_VALUE;
        float coldestAvg = Float.MAX_VALUE;
        int hottestDay = 0;
        int coldestDay = 0;

        for (int i = 0; i < temp.length; i++) {
            float sum = 0;

            for (int j = 0; j < temp[i].length; j++) {
                sum += temp[i][j];
            }

            float avg = sum / 24;

            if (avg > hottestAvg) {
                hottestAvg = avg;
                hottestDay = i;
            }

            if (avg < coldestAvg) {
                coldestAvg = avg;
                coldestDay = i;
            }
        }

        System.out.println("Hottest day: Day " + hottestDay + " with avg temp " + hottestAvg);
        System.out.println("Coldest day: Day " + coldestDay + " with avg temp " + coldestAvg);
    }

    public static void avgPerDay(float[][] temp) {
        
        for(int i=0; i<temp.length; i++)
        {
            float sum=0;
            for(int j=0; j<temp[0].length; j++)
            {
                sum+=temp[i][j];
                
            }
            float avgPerDay=sum/24;
            System.out.println("Day"+i+" average temp:"+avgPerDay);
            
        }

    }

}

