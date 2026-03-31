//BankAccountRentalSystem
//interface with abstract methods
interface Loanable {
    public abstract double applyForLoan(double loanAmount);

    public abstract void calculateLoanEligibility();
}

// abstract class
abstract class BankAccount implements Loanable{
    private int accountNumber;
    private String holderName;
    protected double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // getter
    public int getaccountNumber() {
        return accountNumber;
    }

    public String getholderName() {
        return holderName;
    }

    public double getbalance() {
        return balance;
    }

      // Abstract method
    public abstract double calculateInterest();

    // Concrete method
    public void displayDetails() {
        System.out.println("BankAccount Number: " + getaccountNumber());
        System.out.println("holder name: " + getholderName());
        System.out.println("balance: " + getbalance());
    }

   
}

// class extending abstract class
class SavingAccount extends BankAccount {
    private double interestRate=5;
    boolean eligible=false;

    SavingAccount(int accountNumber, String holderName,double balance) {
        super(accountNumber,holderName, balance);
    }

    // overriding abstarct class abstract method
    @Override
    public double calculateInterest() {
        double balanceWithInterest=balance+(balance*interestRate)/100;
        return balanceWithInterest;
    }

    // overidding interface mathod
     @Override
    public void calculateLoanEligibility() {
        eligible = balance > 1000;
        System.out.println("Loan Eligibility for SavingsAccount: " + eligible);
    }

    @Override
    public double applyForLoan(double loanAmount) {
        if (eligible) {
            balance += loanAmount;
            System.out.println("Loan of " + loanAmount + " approved. New Balance: " + balance);
        } else {
            System.out.println("Loan denied. Not eligible.");
        }
        return balance;
    }
}

class CurrentAccount extends BankAccount {
    private double interestRate=3;
    boolean eligible=false;

    CurrentAccount(int accountNumber, String holderName,double balance) {
        super(accountNumber,holderName, balance);
    }

    // overriding abstarct class abstract method
    @Override
    public double calculateInterest() {
        double balanceWithInterest=balance+(balance*interestRate)/100;
        return balanceWithInterest;
    }

    // overidding interface mathod
    @Override
    public void calculateLoanEligibility() {
        eligible = balance > 5000;
        System.out.println("Loan Eligibility for CurrentAccount: " + eligible);
    }

    @Override
    public double applyForLoan(double loanAmount) {
        if (eligible) {
            balance += loanAmount;
            System.out.println("Loan of " + loanAmount + " approved. New Balance: " + balance);
        } else {
            System.out.println("Loan denied. Not eligible.");
        }
        return balance;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
         SavingAccount s=new SavingAccount(123,"Pooja",200000);
        CurrentAccount c=new CurrentAccount(456,"Riya",10000);
        s.displayDetails();
        s.calculateInterest();
        s.calculateLoanEligibility();
        s.applyForLoan(5000);
        s.displayDetails();
        System.out.println("----------------");
        c.displayDetails();
        c.calculateInterest();
        c.calculateLoanEligibility();
        c.applyForLoan(5000);
        c.displayDetails();
        }
}
