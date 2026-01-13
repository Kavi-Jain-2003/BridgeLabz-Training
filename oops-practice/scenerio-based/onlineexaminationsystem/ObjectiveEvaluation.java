package onlineexaminationsystem;

public class ObjectiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(String[] answers, Exam exam) throws ExamTimeExpiredException {
        if (answers.length != exam.count) {
            throw new ExamTimeExpiredException("You submitted incomplete answers!");
        }
        int score = 0;
        for (int i = 0; i < exam.count; i++) {
            if (answers[i].equalsIgnoreCase(exam.questions[i].answer)) {
                score++;
            }
        }
        return score;
    }
}
