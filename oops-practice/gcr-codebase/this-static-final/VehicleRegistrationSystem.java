//Create a Vehicle class with the following features:
 class Vehicle {
    //attributes
    String ownerName;
    String vehicleType;    
    //static variable
    static int registrationFee=200;
    
    //final variable
     final String registrationNumber;
     //parametrized constructor
    Vehicle(String ownerName,String vehicleType,String registrationNumber)
    {
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;    
        this.registrationNumber=registrationNumber;
    }
     // static method
    static void displayRegistrationFee() {
        System.out.println("Registration Fee:" + registrationFee);
        System.out.println();
    }
    
//instance method with instanceof check
    public void displayVehicledetails()
    {
        if(this instanceof Vehicle)
        {
            System.out.println("registrationNumber:"+registrationNumber);
            System.out.println("ownerName:"+ownerName);
            System.out.println("vehicleType:"+vehicleType);            
        }
    }
}
public class VehicleRegistrationSystem
{
    public static void main(String[] args) {
        
        Vehicle v1=new Vehicle("Honest raj","Sedan","ABC123");
        Vehicle v2=new Vehicle("Price danish","SUV","XYZ789");
        v1.displayVehicledetails();
        Vehicle.displayRegistrationFee();
        v2.displayVehicledetails();       
        Vehicle.displayRegistrationFee();
    }

}
