import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LicensePlateNumber
{
	public static void main(String[] args)
	{
		String username="aB1234";
		String regex="^[A-Z]{2}[0-9]{4}$";
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