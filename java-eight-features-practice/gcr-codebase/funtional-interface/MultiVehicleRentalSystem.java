interface VehicleRental
{
	void rent();
	void returnVehicle();
}
class Car implements VehicleRental
{
	@Override
	public void rent()
	{
		System.out.println("Car has been rented");
	}
	@Override
	public void returnVehicle()
	{
		System.out.println("car has been returned");
	}
}
class Bike implements VehicleRental {

    @Override
    public void rent() {
        System.out.println("Bike has been rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned");
    }
}
class Bus implements VehicleRental {

    @Override
    public void rent() {
        System.out.println("Bus has been rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned");
    }
}


public class MultiVehicleRentalSystem {
	public static void main(String[] args)
	{
		VehicleRental car = new Car();
        VehicleRental bike = new Bike();
        VehicleRental bus = new Bus();

        car.rent();
        car.returnVehicle();

        bike.rent();
        bike.returnVehicle();

        bus.rent();
        bus.returnVehicle();
	}
}
