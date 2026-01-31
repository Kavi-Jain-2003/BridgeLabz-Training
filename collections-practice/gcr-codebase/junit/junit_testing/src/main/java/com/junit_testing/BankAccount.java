package com.junit_testing;

public class BankAccount {

    private double balance = 0;

    // Add money
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }
}
