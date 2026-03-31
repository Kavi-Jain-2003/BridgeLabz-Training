//node class
class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

// class to perform linkedlist operations
public class StudentRecordManagement {
    StudentNode head = null;

    // adding nodes
    public void addStudent(int rollNumber, String name, int age, String grade) {
        StudentNode newStudent = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    // deleting a node
    public void deleteNode(int rollNumber) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("student having rollnumber:"+rollNumber+"  deleted successfully");
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            if (temp.next.rollNumber == rollNumber) {
                System.out.println("student having rollnumber:"+rollNumber+"  deleted successfully");
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

        System.out.println("student not found");
    }

    // searching for a node
    public void searchStudent(int rollNumber) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            System.out.println("student having rollnumber:"+rollNumber+"  found successfully");
        }
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("student having rollnumber:"+rollNumber+"  found successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("element is not present");
    }

    // displayig linked list nodes
    public void displayStudent() {
        if (head == null) {
            System.out.println("list is empty");
            ;
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Rollnumber:" + temp.rollNumber + " Name:" + temp.name + " age:" + temp.age + " grade:"
                    + temp.grade);
            temp = temp.next;
        }
    }

    // updating node's grade via rollnumber
    public void updateGrade(int rollNumber, String newGrade) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head.grade = newGrade;
            System.out.println("grade of Student having" + rollNumber + " updated successfully");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("grade of Student having" + rollNumber + " updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("student not found with such rollnumber");

    }

    public static void main(String[] args) {
        StudentRecordManagement s = new StudentRecordManagement();
        s.addStudent(1, "pooja", 22, "A");
        s.addStudent(2, "riya", 23, "B");
        s.displayStudent();
        s.searchStudent(2);
        s.updateGrade(2, "A");
        s.displayStudent();
        s.deleteNode(2);
        s.displayStudent();
    }
}