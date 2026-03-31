import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractProgrammingLanguage
{
	public static void main(String[] args)
	{
		String currency="The price is $45.99, and the discount is 10.50.";
		String regex="\\$?\\d+(\\.\\d{2})?";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(currency);
		while(matcher.find())
		{
			System.out.println("Languages:"+matcher.group());
		}
	}
}