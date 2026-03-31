package hybrid;
import java.util.*;
public class Network {
	public static String validtateIdentifier(String str)
	{
		if(!str.contains("::"))
		{
			return "REJE1CTED DEVICE"; 
		}
		if(str.contains("\\s+"))
		{
			return "REJEC2TED DEVICE";
		}
		String[] split=str.split("::");
		
		if(split.length>2)
		{
			return "REJECT3ED DEVICE";
		}
		String ip6=split[0];
		String mac=split[1];
		if(!ip6.matches("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$"))
		{
			return "REJECTE4D DEVICE";
		}
		if(!mac.matches("^([0-9A-F]{2}:){5}([0-9A-F]{2})$"))
		{
			return "REJECTED5 DEVICE";
		}
		
		return "Authentic Device";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] input=new String[n]; 
		for(int i=0; i<n; i++)
		{
			input[i]=sc.nextLine();
		}
		for(int i=0; i<n; i++)
		{
			System.out.println(validtateIdentifier(input[i]));
			
		}
	}
	
}
