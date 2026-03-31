import java.util.Stack;
public class QuestionStack {
    private Stack<Integer> questionStack=new Stack<>();
    void visitQuestion(int questionId)
    {
        questionStack.push(questionId);
        System.out.println("visited question:"+questionId);
    }
    int goBack()
    {
        if(questionStack.isEmpty())
        {
            System.out.println("no previous question");
            return -1;
        }
        return questionStack.pop();
    }
    boolean isEmpty()
    {
        return questionStack.isEmpty();
    }
}
