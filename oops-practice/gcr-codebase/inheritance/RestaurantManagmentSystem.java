//Restaurant Management System

class Person // super class
{
     protected String name;
    protected int id;

    // Constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
//interface
interface Worker {
    void performDuties();

}

// subclass
class Chef extends Person implements Worker {
    Chef(String name, int id)
    {
        super(name,id);
    }
//overidding interface method
    @Override
    public void performDuties() {
        System.out.println("the chef:"+name+ " is cooking food");
    }
}

// subclass
class Waiter extends Person implements Worker {
   Waiter(String name, int id)
    {
        super(name,id);
    }
//overidding interface method
    @Override
    public void performDuties() {
        System.out.println("the Waiter :"+name+ " is serving food");
    }
}

public class RestaurantManagmentSystem {

    public static void main(String[] args) {
        // accessing methods via child class object
        Chef c=new Chef("Rohan",101);
        c.performDuties();
        Waiter w=new Waiter("mohan",102);
        w.performDuties();

    }
}
