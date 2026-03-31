//Design an Employee class with the following features:
 class Employee {
    //attributes
    String name;
    String designation;
    
    //static variable
    static String companyName="Tech Solutions Inc.";
    static int totalEmployee=0;
    //final variable
     final int id;
     //parametrized constructor
    Employee( int id,String name,String designation)
    {
        this.name=name;
        this.designation=designation;
        this.id=id;
        totalEmployee++;
    }
     // static method
    static void displayTotalEmployee() {
        System.out.println("Total Employees: " + totalEmployee);
        System.out.println("Company Name: " + companyName);
    }
    //instance method with instanceof check
    public void displayEmployeedetails()
    {
        if(this instanceof Employee)
        {
            System.out.println("id:"+id);
            System.out.println("name:"+name);
            System.out.println("designation:"+designation);            
             System.out.println("Company Name: " + companyName);
            System.out.println();
        }
    }
}
public class EmployeeManagementSystem
{
    public static void main(String[] args) {
        
        Employee e1=new Employee(101,"Thamarai","Softare Engineer");
        Employee e2=new Employee(102,"Rohan","Project Manager");
        Employee.displayTotalEmployee();
        e1.displayEmployeedetails();
        e2.displayEmployeedetails();
       
    }
}
