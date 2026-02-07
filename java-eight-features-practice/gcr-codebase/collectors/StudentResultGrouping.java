import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String gradeLevel;

    Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }
}
public class StudentResultGrouping
{
	public static void main(String[] args)
	{
		 List<Student> students = Arrays.asList(
		            new Student("Amit", "A"),
		            new Student("Neha", "B"),
		            new Student("Ravi", "A"),
		            new Student("Sneha", "C"),
		            new Student("Kiran", "B")
		        );
		 Map<String,List<String>> groupByGrade=students.stream()
				 .collect(Collectors.groupingBy(
						 Student::getGradeLevel,
						 Collectors.mapping(Student::getName,Collectors.toList())
						 ));
		 groupByGrade.forEach((grade,names)->
		 System.out.println("Grade "+grade+"->"+names));
		 
	}
}