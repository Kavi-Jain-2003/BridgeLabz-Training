import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractWebPage
{
	public static void main(String[] args)
	{
		String contact="Visit https://www.google.com and http://example.org for more info.";
		String regex="https?://(www.\\.)?([a-zA-Z0-9.-]+)";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(contact);
		while(matcher.find())
		{
			System.out.println("webpage links:"+matcher.group());
		}
	}
}