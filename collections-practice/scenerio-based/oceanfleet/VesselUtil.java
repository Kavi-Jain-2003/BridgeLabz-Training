import java.util.*;
public class VesselUtil {

	private List<Vessel> vesselList=new ArrayList<>();
	
	public void addVesselPerformance(Vessel vessel)
	{
		vesselList.add(vessel);
	}
	public Vessel getVesselById(String vesselId)
	{
		for(Vessel vessel:vesselList)
		{
			if(vessel.getVesselId().equals(vesselId))
			{
				return vessel;
			}
		}
		return null;
	}
	public List<Vessel> getHighPerformanceVessels()
	{
		double maxSpeed=0;
		for(Vessel vessel:vesselList)
		{
			if(vessel.getAverageSpeed()>maxSpeed)
			{
				maxSpeed=vessel.getAverageSpeed();				
			}
		}
		List<Vessel> result=new ArrayList<>();
		for(Vessel vessel:vesselList)
		{
			if(vessel.getAverageSpeed()==maxSpeed)
			{
				result.add(vessel);
			}
		}
		return result;
	}
}
