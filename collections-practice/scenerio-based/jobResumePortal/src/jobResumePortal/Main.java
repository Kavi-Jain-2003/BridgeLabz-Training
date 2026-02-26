package jobResumePortal;
//Main.java
import java.util.*;

public class Main {

 public static void main(String[] args) {

     JobPortalService service = new JobPortalService();

     try {

         Resume r1 = new Resume("Aman",
                 new HashSet<>(Arrays.asList("Java", "SQL", "Spring")));

         Resume r2 = new Resume("Riya",
                 new HashSet<>(Arrays.asList("Java", "React")));

         Resume r3 = new Resume("Karan",
                 new HashSet<>(Arrays.asList("Python", "Django", "SQL")));

         service.addResume(r1);
         service.addResume(r2);
         service.addResume(r3);

     } catch (InvalidResumeException e) {
         System.out.println("Error: " + e.getMessage());
     }

     // Required job skills
     Set<String> requiredSkills =
             new HashSet<>(Arrays.asList("Java", "SQL"));

     service.shortlistResumes(requiredSkills);

     System.out.println("---- Shortlisted Resumes ----");
     service.displayResumes();
 }
}
