//abstract class
abstract class Account
{
    private String name;
    private double balance; 
    //parametrized constructor
    Account(String name,double balance)
    {
        this.name=name;
        this.balance=balance;
    }
    //getters
    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
    //abstract method
    abstract void interestCalculation();

}
class SavingAccount extends Account
{
    private String accountType;
    private double rateOfInterest=0.08;
  
    //parametrized constructor
    SavingAccount(String name, double balance,String accountType)
    {
        super(name,balance);
        this.accountType=accountType;
    }
    //overidding abstract class method
    @Override
    public void interestCalculation()
    {
        double interestAmount=getBalance()*rateOfInterest;
        System.out.println("Saving account interest:"+interestAmount);
    }
    public void displayInfo()
    {        
        System.out.println("Name:"+getName());
        System.out.println("Balance:"+getBalance());
        System.out.println("Accounttype:"+accountType);
        System.out.println("Rate of interest applied:"+rateOfInterest);
    }

}
class CurrentAccount extends Account
{    
    private String accountType;
    private double rateOfInterest=0.04;
    //parametrized Constuctor
    CurrentAccount(String name, double balance,String accountType)
    {
        super(name,balance);
        this.accountType=accountType;
    }
    //overidding abstract class method
    @Override
    public void interestCalculation()
    {
        double interestAmount=getBalance()*rateOfInterest;
        System.out.println("Saving account interest:"+interestAmount);
    }
    public void displayInfo()
    {
        System.out.println("Name:"+getName());
        System.out.println("Balance:"+getBalance());
        System.out.println("Accounttype:"+accountType);
        System.out.println("Rate of interest applied:"+rateOfInterest);
    }

}
public class Abstraction
{
    public static void main(String[] args)
    {
        SavingAccount s=new SavingAccount("Pooja",2000,"Saving account");
        CurrentAccount c=new CurrentAccount("Riya",3000,"Current Account");
        s.displayInfo();
        s.interestCalculation();
        c.displayInfo();        
        c.interestCalculation();

    }
}