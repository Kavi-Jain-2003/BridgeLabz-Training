package bank;

import java.util.*;

class Account {
    String accountNumber;
    String holderName;
    int balance;

    Account(String accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Successfully");
    }

    public void withdraw(int amount) {
        System.out.println("Withdraw not supported");
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accNo, String name, int balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(int amount) {
        int charge = 2;
        int total = amount + charge;
        if (balance - total < 0) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= total;
            System.out.println("Withdrawal Successful");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accNo, String name, int balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(int amount) {
        int charge = 5;
        int total = amount + charge;
        if (balance - total < -10000) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= total;
            System.out.println("Withdrawal Successful");
        }
    }
}

class BusinessAccount extends Account {
    BusinessAccount(String accNo, String name, int balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(int amount) {
        int charge = (int) (amount * 0.01);
        int total = amount + charge;
        if (balance - total < -50000) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= total;
            System.out.println("Withdrawal Successful");
        }
    }
}

class BankManager {
    List<Account> list = new ArrayList<>();

    public void addAccount(String accNo, String name, String type, int balance) {
        Account acc = null;

        if (type.equalsIgnoreCase("SavingsAccount")) {
            acc = new SavingsAccount(accNo, name, balance);
        } else if (type.equalsIgnoreCase("CurrentAccount")) {
            acc = new CurrentAccount(accNo, name, balance);
        } else if (type.equalsIgnoreCase("BusinessAccount")) {
            acc = new BusinessAccount(accNo, name, balance);
        }

        if (acc != null) {
            list.add(acc);
            System.out.println("Account Created: " + accNo);
        }
    }

    public Account findAccount(String accNo) {
        for (Account a : list) {
            if (a.accountNumber.equals(accNo)) {
                return a;
            }
        }
        return null;
    }

    public void withdrawAccount(String accNo, int amount) {
        Account acc = findAccount(accNo);
        if (acc == null) {
            System.out.println("Account Not Found");
        } else {
            acc.withdraw(amount);
        }
    }

    public void depositAccount(String accNo, int amount) {
        Account acc = findAccount(accNo);
        if (acc == null) {
            System.out.println("Account Not Found");
        } else {
            acc.deposit(amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManager bm = new BankManager();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split("\\s+");

            String operation = parts[0];
            String accNo = parts[1];

            if (operation.equals("Create")) {
                String name = parts[2];
                String type = parts[3];
                int balance = Integer.parseInt(parts[4]);
                bm.addAccount(accNo, name, type, balance);
            } else if (operation.equals("Withdraw")) {
                int amount = Integer.parseInt(parts[2]);
                bm.withdrawAccount(accNo, amount);
            } else if (operation.equals("Deposit")) {
                int amount = Integer.parseInt(parts[2]);
                bm.depositAccount(accNo, amount);
            }
        }

        sc.close();
    }
}
