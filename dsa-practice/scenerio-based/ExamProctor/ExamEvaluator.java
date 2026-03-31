importjava.util.HashMap;
public class ExamEvaluator {
    int calculateScore(HashMap<Integer,String> answers)
    {
        int score=0;
        HashMap<Integer,String> correctAnswers=new HashMap<>();
        correctAnswers.put(1,"A");
        correctAnswers.put(2,"B");
        correctAnswers.put(3,"C");
        for(int qId:answers.keySet())
        {
            if(answers.get(qId).equals(correctAnswers.get(qId))){
            score++;
            }
        }
        return score;
    }
    
}
