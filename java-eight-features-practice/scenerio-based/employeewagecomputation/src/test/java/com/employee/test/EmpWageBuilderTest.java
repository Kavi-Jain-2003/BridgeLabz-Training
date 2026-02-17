package com.employee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.employee.service.EmpWageBuilder;
import com.employee.service.IEmpWageBuilder;

public class EmpWageBuilderTest {

    @Test
    void testCompanyWageCalculation() {

        IEmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TestCompany", 20, 20, 100);
        builder.computeWages();

        int totalWage = builder.getTotalWage("TestCompany");

        assertTrue(totalWage >= 0);
    }

    @Test
    void testInvalidCompanyName() {

        IEmpWageBuilder builder = new EmpWageBuilder();

        assertThrows(IllegalArgumentException.class, () -> {
            builder.addCompany("12@", 20, 20, 100);
        });
    }
}
