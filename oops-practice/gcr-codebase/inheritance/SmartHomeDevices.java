//Smart Home Devices 
class Devices // super class
{
    protected int deviceId;
    protected String status;

    Devices(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

// subclass
class Thermostat extends Devices {
    public String temperatureSetting;

    Thermostat(int deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("DeviceId:" + deviceId);
        System.out.println("status:" + status);
        System.out.println("temperatureSetting:" + temperatureSetting);

    }
}

public class SmartHomeDevices {

    public static void main(String[] args) {
        //accessing methods via child class object
        Thermostat t = new Thermostat(101, "HighVoltage", "Cool");
        t.displayStatus();
        Thermostat t1 = new Thermostat(102, "LowVoltage", "Hot");
        t1.displayStatus();
        Thermostat t2 = new Thermostat(103, "NeutralVoltage", "Medium");
        t2.displayStatus();
    }
}