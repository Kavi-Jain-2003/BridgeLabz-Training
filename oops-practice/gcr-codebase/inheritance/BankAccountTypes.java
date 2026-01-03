//Bank Account types
class BankAccount // super class
{
    protected int accountNumber;
    protected double balance;
    //parametrized constuctor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    String displayAccountType()
    {
        return "general bank account";
    }
}

// subclass
class SavingAccount extends BankAccount {
    protected double interestRate;
    //parametrized constuctor
    SavingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    double interestRateCalc()
    {
        double interest = balance * interestRate / 100;
        balance += interest;
        return balance;
    }
 @Override
    String displayAccountType() {
        return "Saving Account";
    }
    
}

// subclass
class CheckingAccount extends BankAccount {
    double withdrawLimit;
    double withdrawAmount;
    //parametrized constuctor
    CheckingAccount(int accountNumber,double balance, double withdrawLimit) {
        super(accountNumber,balance);
        this.withdrawLimit = withdrawLimit;
    }
    void checkBalance(double amount)
    {
        if(amount<=withdrawLimit && amount<=balance)
        {
            balance-=amount;
            System.out.println("Amount deducted is:"+amount+" from your account");
        }
        else
        {
            System.out.println("Withdrawl not allowed");
        }

    }
    @Override
    String displayAccountType() {
        return "Checking Account";
    }

}
//subclass
class FixedDepositAccount extends BankAccount {
    double fdROI;
    double fdYears;
    //parametrized constuctor
    FixedDepositAccount(int accountNumber, double balance,double fdROI,
            double fdYears) {
        super(accountNumber, balance);
        this.fdROI = fdROI;
        this.fdYears = fdYears;
    }
    double calculateMaturityAmount() {
        return balance + (balance * fdROI *fdYears / 100);
    }
    @Override
    String displayAccountType()
    {
        return "FixedDeposit Account";
    }
}

public class BankAccountTypes {

    public static void main(String[] args) {
        // accessing methods via child class object
        SavingAccount s = new SavingAccount(101, 100000, 7);
        System.out.println(s.displayAccountType());
        System.out.println("Balance after interest: " + s.interestRateCalc());

        System.out.println("--------------------------------");

        CheckingAccount c = new CheckingAccount(102, 150000, 20000);
        System.out.println(c.displayAccountType());
        c.checkBalance(15000);
        System.out.println("Remaining balance: " + c.balance);

        System.out.println("--------------------------------");

        FixedDepositAccount f =
                new FixedDepositAccount(103, 107000, 6.5, 3);
        System.out.println(f.displayAccountType());
        System.out.println("Maturity Amount: " + f.calculateMaturityAmount());
        
        
    }
}