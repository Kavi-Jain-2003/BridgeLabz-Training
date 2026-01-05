/*EduQuiz – Student Quiz Grader"
Story: You’re building the grading module for a quiz app. A student answers a 10-question quiz.
You must compare their answers to the correct ones, give feedback, and calculate scores. */

//importing scanner class
import java.util.Scanner;

class QuizGrader {
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // user input
        String[] correctAnswers={"A","B","c","D","A","B","c","D","A","B"};
        String[] studentAnswers=new String[10];
        System.out.println("Enter your option(A/B/C/D) for 10 questions:");
        for(int i=0; i<10; i++)
        {
            studentAnswers[i]=input.nextLine().toUpperCase();
        }
        //calculating score
        int score = calculateScore(correctAnswers, studentAnswers);
//percentage
        float percentage = (score / 10.0f) * 100;

        System.out.println("Final Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");
//pass or fail
        if (percentage >= 60) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        // closing input
        
        input.close();
    }
    //calculating score
    public static int calculateScore(String[] correctAns,String[] studentAns)
    {
        int score=0;
        for(int i=0; i<10; i++)
        {
            if(studentAns[i].equalsIgnoreCase(correctAns[i]))
            {
                System.out.println("Question"+(i+1)+" is correct");
                score++;
            }
            else
            {
                System.out.println("Question"+(i+1)+" is not correct");
            }
        }
        return score;
        
    }

   
}
