package eventFeedback;

public class EventMain {
	public static void main(String[] args) {
		EventFeedbackManager manager = new EventFeedbackManager();
		try {
			manager.addRating("E101", 5);
			manager.addRating("E101", 4);
			manager.addRating("E102", 3);
			manager.addRating("E102", 5);
			manager.addRating("E103", 2);
			// This will throw exception
			manager.addRating("E104", 6);
		} catch (InvalidRatingException e) {
			System.out.println("Invalid rating error:" + e.getMessage());
		}

        manager.displayAllFeedback();

        String topEvent = manager.getTopRatedEvent();
        System.out.println("\nTop Rated Event: " + topEvent);
	}
}
