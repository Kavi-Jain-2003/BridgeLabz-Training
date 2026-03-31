package onlineexaminationsystem;

public class DescriptiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(String[] answers, Exam exam) throws ExamTimeExpiredException {
        if (answers.length != exam.count) {
            throw new ExamTimeExpiredException("You submitted incomplete answers!");
        }
        return answers.length * 5; // each question 5 marks
    }
}
