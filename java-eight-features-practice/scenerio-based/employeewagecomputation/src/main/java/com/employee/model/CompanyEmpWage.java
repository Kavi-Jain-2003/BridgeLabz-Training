package com.employee.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {

    private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    private int totalWage;
    private List<Integer> dailyWages;

    public CompanyEmpWage(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWages = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public void addDailyWage(int wage) {
        dailyWages.add(wage);
    }

    public List<Integer> getDailyWages() {
        return dailyWages;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalWage() {
        return totalWage;
    }

    @Override
    public String toString() {
        return "Company: " + companyName +
                " Total Wage: ₹" + totalWage;
    }
}
