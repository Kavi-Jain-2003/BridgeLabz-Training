//Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below
//importing Scanner class
import java.util.Scanner;
public class ReportCard2D
{
	public static void main(String[] args)
	{
		//Scanner object
		Scanner input=new Scanner(System.in);
		System.out.println("enter no. of students:");
		int n=input.nextInt();
		int[][] pcm=generateRndomPCM(n);
		double[][] result=calculateResult(pcm);
		String[] grade=calculateGrade(result);
		displayScoreCard(pcm,result,grade);
		//closing input
		input.close();
	}
	//generate random 2 digit PCM scores
	public static int[][] generateRndomPCM(int n)
	{
		int[][] pcm=new int[3][3];
		for(int i=0; i<n; i++)
		{
			pcm[i][0]=(int)(Math.random()*90)+10;
			pcm[i][1]=(int)(Math.random()*90)+10;
			pcm[i][2]=(int)(Math.random()*90)+10;
		}
		return pcm;
	}
	public static double[][] calculateResult(int[][] pcm)
	{
		double[][] result=new double[pcm.length][3];
		for(int i=0; i<pcm.length; i++)
		{
			int total=pcm[i][0]+pcm[i][1]+pcm[i][2];
			double avg=total/3.0;
			double percent=(total/300.0)*100;
			result[i][0]=total;
			result[i][1]=Math.round(avg*100.0)/100.0;
			result[i][2]=Math.round(percent*100.0)/100.0;
		}
		return result;
	}
	public static String[] calculateGrade(double[][] result)
	{
		String[] grade=new String[result.length];
		for(int i=0; i<result.length; i++)
		{
			double p=result[i][2];
			if(p>=80)
			{
				grade[i]="A";
			}
			else if(p>=70)
			{
				grade[i]="B";
			}
			else if(p>=60)
			{
				grade[i]="C";
			}
			else if(p>=50)
			{
				grade[i]="D";
			}
			else if(p>=40)
			{
				grade[i]="E";
			}
			else
			{
				grade[i]="R";
			}			
		}
		return grade;		
	}
	public static void displayScoreCard(int[][] pcm, double[][] result, String[] grade)
	{
		for(int i=0; i<pcm.length; i++)
		{
			System.out.println( (i + 1) + "\t" +
                    pcm[i][0] + "\t" +
                    pcm[i][1] + "\t" +
                    pcm[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade[i]
			);
		}
	}		
}
	