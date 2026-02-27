package smartParking;

public abstract class Vehicle {
	protected String vehicleNumber;
	protected String type;
	Vehicle(String vehicleNumber,String type)
	{
		this.vehicleNumber=vehicleNumber;
		this.type=type;
	}
	public String getVehicleNumber()
	{
		return vehicleNumber;
	}
	public String getType()
	{
		return type;
	}
}
class Car extends Vehicle
{
	public Car(String vehicleNumber)
	{
		super(vehicleNumber,"CAR");
	}
}
class Bike extends Vehicle
{
	Bike(String vehicleNumber)
	{
		super(vehicleNumber,"BIKE");
	}
}
class ParkingSlot
{
	private int slotId;
	private boolean isOccupied;
	private String allowedType;
	private Vehicle parkedVehicle;
	public ParkingSlot(int slotId,String allowedType)
	{
		this.slotId=slotId;
		this.allowedType=allowedType;
		this.isOccupied=false;
	}
	public boolean isAvailableFor(Vehicle vehicle)
	{ return !isOccupied && allowedType.equals(vehicle.getType());
    }

    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getSlotId() {
        return slotId;
    }

    public String getAllowedType() {
        return allowedType;
    }
}
		
