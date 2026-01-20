import java.util.HashMap;
public class AnswerStore {
    private HashMap<Integer, String > answerMap=new HashMap<>();
    void saveAnswer(int questionId,String answer)
    {
        answerMap.put(questionId,answer);
        System.out.println("answer saved for question"+questionId);
    }
    String getAnswer(int questionId)
    {
        return answerMap.get(questionId);
    }
    HashMap<Integer,String> getAllAnswer()
    {
        return answerMap;
    }
    
}
