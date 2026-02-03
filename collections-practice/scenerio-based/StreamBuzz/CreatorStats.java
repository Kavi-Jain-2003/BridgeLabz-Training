import java.util.*;

public class CreatorStats {

	static Map<String, double[]> creatorData = new HashMap<>();
	static Scanner sc = new Scanner(System.in);

	public static void putData() {

		System.out.println("enter creator name:");
		String creatorName = sc.nextLine();

		double[] weeklyLikes = new double[4];

		System.out.println("enter 4 week likes:");
		for (int i = 0; i < 4; i++) {
			weeklyLikes[i] = sc.nextDouble();

		}
		creatorData.put(creatorName, weeklyLikes);
		System.out.println("Data added successfully");

	}

	public static double calculateAverageLikes() {
		double sum = 0;
		int totalCount = 0;
		for (double[] likes : creatorData.values()) {
			for (double l : likes) {
				sum += l;
				totalCount++;
			}
		}
		if (totalCount == 0)
			return 0;
		return sum / totalCount;
	}

	public static Map<String, Integer> getTopPostCounts(double likeThreshold) {
		Map<String, Integer> result = new HashMap<>();

		for (Map.Entry<String, double[]> entry : creatorData.entrySet()) {
			int count = 0;
			double[] likes = entry.getValue();
			for (int i = 0; i < likes.length; i++) {
				if (likes[i] >= likeThreshold) {
					count++;
				}
			}
			if (count > 0) {
				result.put(entry.getKey(), count);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println(
					"Enter your choice: 1-To enter creatorName and weeklyLives \n2-To enter threshold \n3-to get average of weekly lives \n4-to logOFF");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				putData();
				break;

			case 2:
				System.out.println("Enter threshold:");
				double threshold = sc.nextDouble();
				sc.nextLine();
				Map<String,Integer> topPosts=getTopPostCounts(threshold);
				if(topPosts.isEmpty())
				{
					System.out.println("no top performing posts this week");
				}
				else
				{
					for(Map.Entry<String,Integer> entry:topPosts.entrySet())
					{
						System.out.println(entry.getKey()+":"+entry.getValue());
					}
				}
				break;

			case 3:
				double average = calculateAverageLikes();
				System.out.println("Overall average weekly likes:" + average);
				break;
			case 4:
				System.out.println("Logging off-Keep creating with StramBuzz");
				break;
			default:
				System.out.println("invalid choice");
			}
		} while (choice != 4);
	}
}