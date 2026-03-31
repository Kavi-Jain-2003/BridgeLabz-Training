import java.util.function.Function;
//takes one ip and returns one op
public class StringLengthChecker {
	public static void main(String[] args)
	{
	int charLimit=20;
			Function<String,Integer> lengthFunction=message-> message.length();
			String message="welcome to java functional interface";
			int length=lengthFunction.apply(message);
			if(length>charLimit)
			{
				System.out.println("message extends character limit");
			}
			else
			{
				System.out.println("message extends character limit");
			}
	}

}
