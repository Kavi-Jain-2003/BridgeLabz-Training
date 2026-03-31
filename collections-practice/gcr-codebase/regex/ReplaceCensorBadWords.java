
public class ReplaceCensorBadWords
{
	public static void main(String[] args)
	{
		String text="This is a damn bad example with some stupid words.";
		String[] words= {"damn","stupid"};
		String regex="\\b("+String.join("|", words)+")\\b";
		String censoredText=text.replaceAll(regex,"***");
		System.out.println("Original text:"+text);
		System.out.println("Replace text:"+censoredText);
	}
}