import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateIPAddress
{
	public static void main(String[] args)
	{
		String username="255.255.255.255";
		String regex="^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"+"(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(username);
		if(matcher.matches())
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}
}