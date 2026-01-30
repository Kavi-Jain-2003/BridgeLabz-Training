import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateSSN
{
	public static void main(String[] args)
	{
		String username="123-45-6789";
		String regex="^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
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