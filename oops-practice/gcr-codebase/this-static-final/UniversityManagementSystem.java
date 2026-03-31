//Create a Student class to manage student data with the following features:
 class Student {
    //attributes
    String name;
    String grade;    
    //static variable
    static String universityName="Global University";
    static int totalStudent;
    
    //final variable
     final int rollNumber;
     //parametrized constructor
    Student(int rollNumber,String name,String grade)
    {
        this.name=name;
        this.grade=grade;    
        this.rollNumber=rollNumber;
    }
     // static method
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudent);
        System.out.println("University Name: " + universityName);
    }
    void updategrade(String newGrade)
        { 
            grade=newGrade;
        }
//instance method with instanceof check
    public void displayStudentdetails()
    {
        if(this instanceof Student)
        {
            System.out.println("rollNumber:"+rollNumber);
            System.out.println("name:"+name);
            System.out.println("grade:"+grade);            
            System.out.println();
        }
    }
}
public class UniversityManagementSystem
{
    public static void main(String[] args) {
        
        Student s1=new Student(101,"Hemashree","A");
        Student s2=new Student(102,"Sharmila","B");
        Student.displayTotalStudents();
        s1.displayStudentdetails();
        s2.displayStudentdetails();
        s2.updategrade("A");
        s2.displayStudentdetails();
       
    }
}
