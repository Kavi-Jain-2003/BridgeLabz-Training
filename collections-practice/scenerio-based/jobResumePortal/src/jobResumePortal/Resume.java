package jobResumePortal;
//Resume.java
import java.util.Set;

public class Resume {

 private String candidateName;
 private Set<String> skills;
 private int matchScore;   // calculated later

 public Resume(String candidateName, Set<String> skills) 
         throws InvalidResumeException {

     if (candidateName == null || candidateName.isEmpty()) {
         throw new InvalidResumeException("Candidate name cannot be empty.");
     }

     if (skills == null || skills.isEmpty()) {
         throw new InvalidResumeException("Skills cannot be empty.");
     }

     this.candidateName = candidateName;
     this.skills = skills;
 }

 public String getCandidateName() {
     return candidateName;
 }

 public Set<String> getSkills() {
     return skills;
 }

 public int getMatchScore() {
     return matchScore;
 }

 public void setMatchScore(int score) {
     this.matchScore = score;
 }

 @Override
 public String toString() {
     return "Name: " + candidateName +
             " | Skills: " + skills +
             " | Match Score: " + matchScore;
 }
}
