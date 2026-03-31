package ship;

public class ShipmentCode {
	String code;
	String date;
	String mode;
	String weight;
	String status;
	public ShipmentCode(String code,String date,String mode,String weight,
	String status)
	{
		this.code=code;
		this.date= date;
		this.mode= mode;
		this.weight= weight;
		this.status= status;
	}
	public String getCode() {
		return code;
	}
	public String getDate() {
		return date;
	}
	public String getMode() {
		return mode;
	}
	public String getWeight() {
		return weight;
	}
	public String getStatus() {
		return status;
	}
	@Override  
	public String toString()
	{
		return "SHIP<"+code+"|"+date+"|"+mode+"|"+weight+"|"+status;
	}
}
