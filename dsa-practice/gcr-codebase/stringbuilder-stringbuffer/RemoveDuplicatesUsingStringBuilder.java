import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {
	public static void main(String[] args) {
		String input="programming";
		String result=removeDuplicates(input);
		System.out.println("Original string:"+input);
		System.out.println("reverse string:"+result);
		
	}
	
	//method to remove duplicates	
public static String removeDuplicates(String str)
{
	//object creation
	StringBuilder sb=new StringBuilder();
	HashSet<Character> set=new HashSet<>();
	
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
		if(!set.contains(ch))
		{
			sb.append(ch);
			set.add(ch);			
		}
	}
	return sb.toString();
	}
	
}
