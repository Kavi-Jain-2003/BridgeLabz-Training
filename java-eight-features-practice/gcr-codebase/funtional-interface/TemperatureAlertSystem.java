import java.util.function.Predicate;
//predicate to check condition and return boolean value having only one abstract Test()
public class TemperatureAlertSystem {
	public static void main(String[] args)
	{
		double threshold=37.5;
		
		Predicate<Double> hightemp=temp->temp>threshold;
		double currtemp=38.2;
		if(hightemp.test(currtemp))
		{
			System.out.println("Alert! temperature crosses threshold");
		}
		else
		{
			System.out.println("temperature is normal");
		}
	}

}
