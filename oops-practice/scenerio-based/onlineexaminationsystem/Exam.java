package onlineexaminationsystem;

public class Exam {
    String subject;
    Question[] questions;
    int count;

    public Exam(String subject) {
        this.subject = subject;
        this.questions = new Question[5]; // max 5 questions
        this.count = 0;
    }

    public void addQuestion(Question q) {
        if (count < questions.length) {
            questions[count++] = q;
            System.out.println("Added question: " + q.text);
        }
    }
}

