import java.util.Scanner;

public class ExamProctorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamProctorManager manager = new ExamProctorManager();

        while (true) {
            System.out.println("\n1.Visit Question  2.Answer Question  3.Submit Exam  4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter question id: ");
                    int qId = sc.nextInt();
                    manager.visitQuestion(qId);
                    break;

                case 2:
                    System.out.print("Enter question id: ");
                    int qNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter answer: ");
                    String ans = sc.nextLine();
                    manager.answerQuestion(qNo, ans);
                    break;

                case 3:
                    manager.submitExam();
                    break;

                case 4:
                    System.out.println("Exiting Exam Proctor...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
