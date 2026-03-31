//HospitalPatientManagement
//interface with abstract methods
interface MedicalRecord {
    public abstract void addRecord();

    public abstract void viewRecord();
}

// abstract class
abstract class Patient {
    private int patientId;
    private String name;
    protected int age;

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // getter
    public int getpatientId() {
        return patientId;
    }

    public String getPatientName() {
        return name;
    }

    public double getage() {
        return age;
    }

    // setter
    public void setage(int age) {
        this.age = age;
    }
    // abstract method

    abstract double calculateBill();

   
}

// class extending abstract class
class InPatient extends Patient implements MedicalRecord {
    private double bedRate =200;
    private double pillsBill=100;
    private double days;

    InPatient(int patientId, String name, int age, double bedRate,double pillsBill,double days) {
        super(patientId, name, age);
        this.bedRate = bedRate;
        this.pillsBill = pillsBill;
        this.days=days;
    }

    // overriding abstarct class abstract method
    @Override
    double calculateBill() {
        return (bedRate+pillsBill)*days;
    }

    // overidding interface mathod
    @Override
    public void addRecord() {
        System.out.println("Adding inpatient medical records:");
        
    }

    // overidding interface mathod
    @Override
    public void viewRecord() {
        System.out.println("Patientid:"+getpatientId());
        System.out.println("patient name:"+getPatientName());
        System.out.println("patient age:"+getage());
        System.out.println("Bill:"+calculateBill());
        System.out.println();
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double pillsBill;
    private double consultationFee;

    OutPatient(int patientId, String name, int age,double pillsBill,double consultationFee) {
        super(patientId, name, age);
        this.pillsBill = pillsBill;
        this.consultationFee=consultationFee;
    }

    // overriding abstarct class abstract method
    @Override
    double calculateBill() {
        return (consultationFee+pillsBill);
    }

    // overidding interface mathod
    @Override
    public void addRecord() {
        System.out.println("Adding outpatint medical record..");
        
    }

    // overidding interface mathod
    @Override
    public void viewRecord() {
        System.out.println("Patientid:"+getpatientId());
        System.out.println("patient name:"+getPatientName());
        System.out.println("patient age:"+getage());
        System.out.println("Bill:"+calculateBill());
        System.out.println();
    }
}

public class HospitalPatientSystem {
    public static void main(String[] args) {
       MedicalRecord i=new InPatient(101,"Pooja",34,200,100,3);
	   MedicalRecord o=new OutPatient(102,"saluja",34,100,50);
       i.viewRecord();
       o.viewRecord();
    }
}
