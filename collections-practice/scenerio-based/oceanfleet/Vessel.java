public class Vessel
{
	String vesselId;
	String vesselName;
	double averageSpeed;
	String vesselType;
	Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType)
	{
		this.vesselId=vesselId;
		this.vesselName=vesselName;
		this.averageSpeed=averageSpeed;
		this.vesselType=vesselType;
	}
	public String getVesselId()
	{
		return vesselId;
	}
	public String getVesselName()
	{
		return vesselName;		
	}
	public String getVesselType()
	{
		return vesselType;
	}
	public double getAverageSpeed()
	{
		return averageSpeed;
	}
	@Override
	public String toString()
	{
		return vesselId+"|"+vesselName+"|"+vesselType+"|"+averageSpeed;
		}
	
}