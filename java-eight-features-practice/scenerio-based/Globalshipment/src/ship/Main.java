package ship;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		shipUtil su=new shipUtil();
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
			String[] splitInput=input[i].split("\\|");
			String code=splitInput[0];
			String date=splitInput[1];
			String mode=splitInput[2];
			String weight =splitInput[3];
			String status=splitInput[4];
			ShipmentCode shipcode=new ShipmentCode(code,date,mode,weight,status);
			boolean valid=su.checkComplaint(shipcode);
			if(valid)
			{
				System.out.println("COMPLAINT RECORD");
			}
			else
			{
				System.out.println("NON-COMPLAINT RECORD");
			}
			
		}
	}
}
