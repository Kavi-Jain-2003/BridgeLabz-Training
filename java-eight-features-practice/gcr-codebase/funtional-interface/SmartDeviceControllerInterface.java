interface DeviceController
{
	void turnOn();
	void turnOff();
}
class Lights implements DeviceController
{
	@Override
	public void turnOn()
	{
		System.out.println("turning on the lights");	
		}
	@Override
	public void turnOff()
	{
		System.out.println("turning off the lights");
	}	
}
class AC implements DeviceController
{
	@Override
	public void turnOn()
	{
		System.out.println("turning on the AC");	
		}
	@Override
	public void turnOff()
	{
		System.out.println("turning off the AC");
	}	
}
class TV implements DeviceController
{
	@Override
	public void turnOn()
	{
		System.out.println("turning on the TV");	
		}
	@Override
	public void turnOff()
	{
		System.out.println("turning off the tv");
	}	
}
public class SmartDeviceControllerInterface
{
	public static void main(String[] args)
	{
		DeviceController l=new Lights();
		DeviceController a=new AC();
		DeviceController t=new TV();
		l.turnOn();
		l.turnOff();
		a.turnOn();
		a.turnOff();
		t.turnOn();
		t.turnOff();
	}
}