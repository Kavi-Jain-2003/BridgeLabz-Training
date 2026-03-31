package onlineexaminationsystem;

public class OnlineExaminationSystem {

    public static void main(String[] args) {

        // Student
        Student student = new Student("Rahul");

        // Exam
        Exam exam = new Exam("Java Basics");

        // Add questions
        exam.addQuestion(new Question("Java is a ___ language?", "Object-Oriented"));
        exam.addQuestion(new Question("JVM stands for?", "Java Virtual Machine"));

        // Student answers
        String[] objectiveAnswers = {"Object-Oriented", "Java Virtual Machine"};
        String[] descriptiveAnswers = {"Answer1", "Answer2"};

        // Objective evaluation
        EvaluationStrategy objEval = new ObjectiveEvaluation();
        try {
            int score = objEval.evaluate(objectiveAnswers, exam);
            System.out.println(student.name + " scored (Objective): " + score);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }

        // Descriptive evaluation
        EvaluationStrategy descEval = new DescriptiveEvaluation();
        try {
            int score = descEval.evaluate(descriptiveAnswers, exam);
            System.out.println(student.name + " scored (Descriptive): " + score);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
