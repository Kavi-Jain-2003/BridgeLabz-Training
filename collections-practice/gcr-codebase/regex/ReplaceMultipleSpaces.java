
public class ReplaceMultipleSpaces
{
	public static void main(String[] args)
	{
		String text="This    is  an     example   with  multiple spaces.";
		String replaceText=text.replaceAll("\\s+"," ");
		System.out.println("Original text:"+text);
		System.out.println("Replace text:"+replaceText);
	}
}