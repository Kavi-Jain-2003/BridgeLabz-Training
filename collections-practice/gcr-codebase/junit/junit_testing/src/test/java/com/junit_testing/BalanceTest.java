package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BalanceTest {

    @Test
    public void Test_Deposit_ValidAmount() {
        BalanceTesting account = new BalanceTesting(100);
        account.deposit(50);

        assertEquals(150, account.getBalance());
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
    	BalanceTesting account = new BalanceTesting(100);

        assertEquals(
            "Deposit amount cannot be negative",
            assertThrows(IllegalArgumentException.class,
                () -> account.deposit(-10)
            ).getMessage()
        );
    }

    @Test
    public void Test_Withdraw_ValidAmount() {
    	BalanceTesting account = new BalanceTesting(200);
        account.withdraw(50);

        assertEquals(150, account.getBalance());
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
    	BalanceTesting account = new BalanceTesting(100);

        assertEquals(
            "Insufficient funds.",
            assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(150)
            ).getMessage()
        );
    }
}
