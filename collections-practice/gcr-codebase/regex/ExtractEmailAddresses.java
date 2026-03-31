import java.util.regex.*;
public class ExtractEmailAddresses
{
	public static void main(String[] args)
	{
		String contact="Contact us at support@example.com and info@company.org";
		String regex="[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(contact);
		while(matcher.find())
		{
			System.out.println("emailIds:"+matcher.group());
		}
	}
}