package onlineexaminationsystem;

public interface EvaluationStrategy {
    int evaluate(String[] answers, Exam exam) throws ExamTimeExpiredException;
}
