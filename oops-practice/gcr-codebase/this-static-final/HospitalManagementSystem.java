//Create a Patient class with the following features:
 class Patient {
    //attributes
    String name;
    int age;
    String ailment;    
    //static variable
    static String hospitalName="City Hospital";
    static int totalPatients=0;
    
    //final variable
     final String patientID;
     //parametrized constructor
    Patient(String patientID,String name,int age,String ailment)
    {
        this.patientID=patientID;
        this.name=name;
        this.age=age;
        this.ailment=ailment;  
        totalPatients++;          
    }
     // static method
    static void getTotalpatients() {
        System.out.println("Toatal patients admitted:" +totalPatients);
    }
    
//instance method with instanceof check
    public void displayPatientdetails()
    {
        if(this instanceof Patient)
        {
            System.out.println("Hospital Name:"+hospitalName);
            System.out.println("patientID:"+patientID);
            System.out.println("name:"+name);
            System.out.println("age:"+age);
            System.out.println("ailment:"+ailment);            
        }
    }
}
public class HospitalManagementSystem
{
    public static void main(String[] args) {
        
        Patient p1=new Patient("P001","Lathika",30,"Flu");
        Patient p2=new Patient("P002","Lidiya",45,"Fracture");
        Patient.getTotalpatients();
        
        p1.displayPatientdetails();       
        p2.displayPatientdetails();       

    }

}
