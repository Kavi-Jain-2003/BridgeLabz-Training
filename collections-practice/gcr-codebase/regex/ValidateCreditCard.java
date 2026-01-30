public class ValidateCreditCard
{
	public static void main(String[] args)
	{
		String visaCard="4567890123453233";
		String masterCard="2567890123453233";
		String regex = "^(4\\d{15}|5\\d{15})$";  //or ^4\\d{15}$
		
		System.out.println(visaCard.matches(regex));	
		System.out.println(masterCard.matches(regex));	
	}
}