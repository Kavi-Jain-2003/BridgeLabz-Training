
interface LightAction
{
	 abstract void execute();
}
public class SmartHomeLightingAutomation
{
	public static void main(String[] args)
	{
		LightAction motionDetected=()->System.out.println("Lights On-Motion Detected");
		
		LightAction morningTime=()->System.out.println("Lights set to warm white-Good morning");
		
		LightAction voiceCommand=()->System.out.println("Lights dimmed-voice command receiveed");
		
		triggerEvent("motion",motionDetected);
		triggerEvent("morning",morningTime);
		triggerEvent("voice",voiceCommand);
		
		
		
		
	}
	public static void triggerEvent(String event,LightAction action)
	{
		System.out.println("Event:"+event);
		action.execute();
		System.out.println();
	}
	
}
