package jobResumePortal;
//JobPortalService.java
import java.util.*;

public class JobPortalService {

 private List<Resume> resumes = new ArrayList<>();

 public void addResume(Resume resume) {
     resumes.add(resume);
 }

 // Rank resumes based on job required skills
 public void shortlistResumes(Set<String> requiredSkills) {

     for (Resume resume : resumes) {

         int score = 0;

         for (String skill : resume.getSkills()) {
             if (requiredSkills.contains(skill)) {
                 score++;
             }
         }

         resume.setMatchScore(score);
     }

     // Sort using Comparator
     Collections.sort(resumes, new ResumeRankComparator());
 }

 public void displayResumes() {
     for (Resume r : resumes) {
         System.out.println(r);
     }
 }
}
