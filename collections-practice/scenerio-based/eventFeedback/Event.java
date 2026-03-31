package eventFeedback;

public class Event {
	private String eventId;
	private String eventName;
	Event(String eventId, String eventName)
	{
		this.eventId=eventId;
		this.eventName=eventName;
	}
	public String getEventId()
	{
		return eventId;
	}
	public String getEventName()
	{
		return eventName;
	}
	@Override
	public String toString()
	{
		return "EventId:"+eventId+" eventName:"+eventName;
	}
}
