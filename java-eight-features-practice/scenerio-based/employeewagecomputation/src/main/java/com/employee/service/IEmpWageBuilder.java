package com.employee.service;

public interface IEmpWageBuilder {

    void addCompany(String companyName, int wagePerHour,
                    int maxWorkingDays, int maxWorkingHours);

    void computeWages();

    int getTotalWage(String companyName);
}
