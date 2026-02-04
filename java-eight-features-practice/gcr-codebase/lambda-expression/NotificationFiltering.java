import java.util.*;
import java.util.function.Predicate;
class Alert
{
	String type;
	String message;
	public Alert(String type,String message)
	{
		this.type=type;
		this.message=message;
	}
	@Override
	public String toString()
	{
		return type+":"+message;
	}
}

public class NotificationFiltering {
	public static void main(String[] args)
	{

	List<Alert> alerts=new ArrayList<>();
	 alerts.add(new Alert("Medication", "Time to take your morning pills"));
     alerts.add(new Alert("Appointment", "Dentist appointment at 10 AM"));
     alerts.add(new Alert("Emergency", "High blood pressure detected"));
     alerts.add(new Alert("Medication", "Time for your evening pills"));
     
     
     Predicate<Alert> showMedicationAlerts=alert->alert.type.equals("Medication");
     Predicate<Alert> showEmergencyAlerts=alert->alert.type.equals("Emergency");
     
     System.out.println("user wants only medication alerts:");
     filterAlerts(alerts,showMedicationAlerts);
     System.out.println("user wants only emergency alerts:");
     filterAlerts(alerts,showEmergencyAlerts);
     //both alerts
     System.out.println("\nUser wants both Medication and Emergency alerts:");
     filterAlerts(alerts, showMedicationAlerts.or(showEmergencyAlerts));
	}
	
	public static void filterAlerts(List<Alert> alerts,Predicate<Alert> condition)
	{
		for(Alert alert:alerts)
		{
			if(condition.test(alert))
			{
				System.out.println(alert);
			}
		}
	}

}
