import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindRepeatingWord
{
	public static void main(String[] args)
	{
		String word="This is is a repeated repeated word test.";
		String regex="\\b(\\w+)\\b\\s+\\1\\b";
		Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(word);
		while(matcher.find())
		{
			System.out.println("repeated word:"+matcher.group(1));
		}
	}
}