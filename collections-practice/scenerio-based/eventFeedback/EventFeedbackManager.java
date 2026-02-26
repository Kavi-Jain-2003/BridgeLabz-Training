package eventFeedback;
import java.util.*;
public class EventFeedbackManager {
	Map<String,List<Integer>> feedbackMap=new HashMap<>();
	
	public void addRating(String eventId,int rating) throws InvalidRatingException
	{
		if(rating<1||rating>5)
		{
			throw new InvalidRatingException("rating must be 1-5");
		}
		feedbackMap.putIfAbsent(eventId, new ArrayList<>());
		feedbackMap.get(eventId).add(rating);
	}
	public  double getAverageRating(String eventId)
	{
		List<Integer> ratings=feedbackMap.get(eventId);
		if(ratings==null|| ratings.isEmpty())
		{
			return 0.0;
		}
		int sum=0;
		for(int r:ratings)
		{
			sum+=r;
		}
		return (double)sum/ratings.size();
	}
	public String getTopRatedEvent()
	{
		double maxAverage=0.0;
		String topEvent=null;
		for(String eventId:feedbackMap.keySet())
		{
			double avg=getAverageRating(eventId);
			if(avg>maxAverage)
			{
				maxAverage=avg;
				topEvent=eventId;
			}
		}
		return topEvent;
	}
	
	public void displayAllFeedback()
	{
		 for (String eventId : feedbackMap.keySet()) {
	            System.out.println("Event ID: " + eventId +
	                    " | Ratings: " + feedbackMap.get(eventId) +
	                    " | Average: " + getAverageRating(eventId));
	        }
	}

	
}
