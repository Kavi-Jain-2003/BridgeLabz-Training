//School with different roles
class Person // super class
{
    protected String name;
    protected int age;
    //parametrized constuctor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String displayRole()
    {
        return "I am the Person";
    }
}

// subclass
class Teacher extends Person {
    protected String subject;
    //parametrized constuctor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    String displayRole()
    {
        return "I am the Teacher";
    }
    
}

// subclass
class Student extends Person {
    String grade;
    //parametrized constuctor
    Student(String name,int age, String grade) {
        super(name,age);
        this.grade = grade;
    }
    
    @Override
    String displayRole()
    {
        return "I am the Student";
    }
}
//subclass
class Staff extends Person {
    String post;
    //parametrized constuctor
    Staff(String name, int age, String post) {
        super(name, age);
        this.post=post;
    }
    
    @Override
    String displayRole()
    {
        return "I am a Personal Secretary";
    }
}

public class SchoolWithDifferentRoles {

    public static void main(String[] args) {
        // accessing methods via child class object
         System.out.println("Program started");

        Student s = new Student("Mohan", 24, "A");
        System.out.println(s.displayRole());

        Teacher t = new Teacher("Sohan", 34, "MBA");
        System.out.println(t.displayRole());

        Staff f = new Staff("Rohan", 27, "Personal Secretary");
        System.out.println(f.displayRole());
    }
}
