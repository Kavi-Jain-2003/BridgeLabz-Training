import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
	public static void main(String[] args) {

		String paragraph = "java stream api java stream collectors api";
		Map<String,Integer> wordCount=Arrays.stream(paragraph.split("\\s+"))
				.collect(Collectors.toMap(
						word->word,
						word->1,
						Integer::sum));
		wordCount.forEach((word,count)->
		System.out.println(word+"->"+count));
	}
}