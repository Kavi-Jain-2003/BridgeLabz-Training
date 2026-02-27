package hackathon;
import java.util.*;

//Custom Exception
class LateSubmissionException extends Exception {
 public LateSubmissionException(String message) {
     super(message);
 }
}

//Participant Class
class Participant {

 String name;
 Map<Integer, Boolean> results = new HashMap<>();
 int score;

 public Participant(String name) {
     this.name = name;
 }

 // Add test case result
 public void addResult(int questionId, boolean passed) {
     results.put(questionId, passed);
 }

 // Calculate score (10 marks per correct answer)
 public void calculateScore() {
     score = 0;
     for (boolean passed : results.values()) {
         if (passed) {
             score += 10;
         }
     }
 }
}

//Main Class
public class OnlineHackathon {

 public static void main(String[] args) {

     List<Participant> participants = new ArrayList<>();

     try {

         Participant p1 = new Participant("Rahul");
         p1.addResult(1, true);
         p1.addResult(2, true);
         p1.addResult(3, false);
         p1.calculateScore();

         Participant p2 = new Participant("Priya");
         p2.addResult(1, true);
         p2.addResult(2, true);
         p2.addResult(3, true);
         p2.calculateScore();

         Participant p3 = new Participant("Aman");
         p3.addResult(1, false);
         p3.addResult(2, true);
         p3.addResult(3, false);
         p3.calculateScore();

         // Example Late Submission Check
         boolean isLate = false;
         if (isLate) {
             throw new LateSubmissionException("Submission was late!");
         }

         participants.add(p1);
         participants.add(p2);
         participants.add(p3);

     } catch (LateSubmissionException e) {
         System.out.println(e.getMessage());
     }

     // Sort by score (Descending)
     Collections.sort(participants, new Comparator<Participant>() {
         public int compare(Participant a, Participant b) {
             return b.score - a.score;
         }
     });

     // Display Leaderboard
     System.out.println("🏆 Leaderboard");
     int rank = 1;
     for (Participant p : participants) {
         System.out.println(rank + ". " + p.name + " - Score: " + p.score);
         rank++;
     }
 }
}
