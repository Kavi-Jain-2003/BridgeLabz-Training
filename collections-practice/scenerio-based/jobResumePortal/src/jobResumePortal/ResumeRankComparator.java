package jobResumePortal;
//ResumeRankComparator.java
import java.util.Comparator;

public class ResumeRankComparator implements Comparator<Resume> {

 @Override
 public int compare(Resume r1, Resume r2) {
     return Integer.compare(r2.getMatchScore(), r1.getMatchScore());
     // Descending order (Higher score first)
 }
}
