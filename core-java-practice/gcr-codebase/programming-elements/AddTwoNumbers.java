//Write a program that takes two numbers as input from the user and prints
their sum.
public class AddTwoNumbers
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int add=num1+num2;
		System.out.println(add);
	}
}
	