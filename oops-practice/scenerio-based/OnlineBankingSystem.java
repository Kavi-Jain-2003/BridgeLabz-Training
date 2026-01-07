class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}
interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double calculateInterest();
}
abstract class Account
{
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;
    Account(int accountNumber, String accountHolder, double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void checkBalance()
    {
        System.out.println("Balance:"+balance);
    }

}
class SavingsAccount extends Account implements BankService
{
    SavingsAccount(int accountNumber, String accountHolder, double balance)
    {
        super(accountNumber, accountHolder, balance);
    }
    @Override
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println(amount+" deposited");
    }
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(amount>balance)
        {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance-=amount;
        System.out.println(amount+" withdrawn by "+Thread.currentThread().getName());
    }
    @Override
    public double calculateInterest()
    {
        return balance*0.04;
    }

}
class CurrentAccount extends Account implements BankService
{
    CurrentAccount(int accountNumber, String accountHolder, double balance)
    {
        super(accountNumber, accountHolder, balance);
    }
    @Override
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println(amount+" deposited");
    }
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(amount>balance)
        {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance-=amount;
        System.out.println(amount+" withdrawn by "+Thread.currentThread().getName());
    }
    @Override
    public double calculateInterest()
    {
        return balance*0.04;
    }

}
class Transaction extends Thread
{
    private BankService account;
    Transaction(BankService account)
    {
        this.account=account;
    }
    @Override
    public void run()
    {
        try
        {
            account.withdraw(1000);
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage()+ " in "+Thread.currentThread().getName() );
        }
    }


}
public class OnlineBankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount(101,"Pooja",3000);
        sa.checkBalance();
        System.out.println("Interest: "+sa.calculateInterest());
        Transaction t1=new Transaction(sa);
        Transaction t2=new Transaction(sa);
        t1.start();
        t2.start();        
    }
    
}
