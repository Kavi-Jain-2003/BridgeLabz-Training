//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

//importing Scanner class for input
import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		 
        int physicsMarks = input.nextInt();
        int chemistryMarks = input.nextInt();
        int mathsMarks = input.nextInt();
		

        // calculate total,averageMarks and percentage
        double total = physicsMarks + chemistryMarks + mathsMarks;
		double averageMarks=total/3.0;
        double percentage = (total / 300) * 100;

        String grade = "";
        String remarks = "";

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } 
        else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } 
        else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } 
        else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } 
        else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } 
        else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("Average Marks = " + averageMarks);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);//closing the input
        input.close();
		
    }
}