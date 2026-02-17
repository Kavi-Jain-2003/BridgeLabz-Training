package com.employee.presentation;

import com.employee.service.EmpWageBuilder;
import com.employee.service.IEmpWageBuilder;

public class EmployeeWageApp {

    public static void main(String[] args) {
    	System.out.println("Welcome to Employee Wage Computation Program");

        IEmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);
        builder.addCompany("Wipro", 30, 18, 90);

        builder.computeWages();

        EmpWageBuilder wageBuilder = (EmpWageBuilder) builder;
        wageBuilder.displayAllCompanies();

        System.out.println("Total Wage for TCS: ₹"
                + builder.getTotalWage("TCS"));
    }
}
