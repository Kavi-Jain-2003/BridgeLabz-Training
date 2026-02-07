class Vehicle implements Cloneable {

    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Model: " + model + ", Speed: " + speed);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();   // shallow copy
    }
}
public class PrototypeDemo {

    public static void main(String[] args) {

        try {
            Vehicle original = new Vehicle("Tesla", 120);
            Vehicle cloned = (Vehicle) original.clone();

            original.display();
            cloned.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
