class ExamProctorManager {

    private QuestionStack navigationStack = new QuestionStack();
    private AnswerStore answerStore = new AnswerStore();
    private ExamEvaluator evaluator = new ExamEvaluator();

    void visitQuestion(int questionId) {
        navigationStack.visitQuestion(questionId);
    }

    void answerQuestion(int questionId, String answer) {
        answerStore.saveAnswer(questionId, answer);
    }

    void submitExam() {
        int score = evaluator.calculateScore(answerStore.getAllAnswers());
        System.out.println("Exam submitted");
        System.out.println("Final Score: " + score);
    }
}
