//Digital Watch Simulation

public class DigitalWatchSimulation {

	public static void main(String[] args) {

		for(int hour=0; hour<24; hour++)
		{
			for(int min=0; min<60; min++)
			{
				if(hour==13 && min==0)
				{
					System.out.println("power cut");
					break;
				}
				System.out.printf("%02d:%02d\n",hour,min);
			}
			if(hour==13)
			{
				System.out.println("power cut");
				break;
			}
		}
	}

}
