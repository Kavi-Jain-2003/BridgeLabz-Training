import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractCapitalizedWords
{
	public static void main(String[] args)
	{
		String contact="The Eiffel TOWER is in Paris and the Statue of Liberty is in New York";
		String regex="[^A-Z][A-Z][a-z]+";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(contact);
		while(matcher.find())
		{
			System.out.println("capital words:"+matcher.group());
		}
	}
}