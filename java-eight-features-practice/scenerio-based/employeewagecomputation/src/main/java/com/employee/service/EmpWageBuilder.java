package com.employee.service;

import com.employee.dao.CompanyEmpWageDAOImpl;
import com.employee.dao.ICompanyEmpWageDAO;
import com.employee.model.CompanyEmpWage;

import java.util.Random;
import java.util.regex.Pattern;

public class EmpWageBuilder implements IEmpWageBuilder {

    private ICompanyEmpWageDAO companyDAO;

    private static final String COMPANY_REGEX = "^[A-Za-z]{3,}$";

    public EmpWageBuilder() {
        companyDAO = new CompanyEmpWageDAOImpl();
    }

    @Override
    public void addCompany(String companyName, int wagePerHour,
                           int maxWorkingDays, int maxWorkingHours) {

        if (!Pattern.matches(COMPANY_REGEX, companyName)) {
            throw new IllegalArgumentException("Invalid Company Name");
        }

        CompanyEmpWage company = new CompanyEmpWage(
                companyName, wagePerHour,
                maxWorkingDays, maxWorkingHours);

        companyDAO.addCompany(company);
    }

    @Override
    public void computeWages() {

        for (CompanyEmpWage company : companyDAO.getAllCompanies()) {

            int totalHours = 0;
            int totalDays = 0;
            int totalWage = 0;

            Random random = new Random();

            while (totalHours <= company.getMaxWorkingHours()
                    && totalDays < company.getMaxWorkingDays()) {

                totalDays++;

                int empCheck = random.nextInt(3); // UC1
                int empHours;

                // UC3 Switch Case
                switch (empCheck) {
                    case 1:
                        empHours = 8; // Full Time
                        break;
                    case 2:
                        empHours = 4; // Part Time
                        break;
                    default:
                        empHours = 0; // Absent
                }

                totalHours += empHours;

                int dailyWage = empHours * company.getWagePerHour();
                totalWage += dailyWage;

                company.addDailyWage(dailyWage);
            }

            company.setTotalWage(totalWage);
        }
    }

    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyDAO.getAllCompanies()) {

            if (company.getCompanyName()
                    .equalsIgnoreCase(companyName)) {
                return company.getTotalWage();
            }
        }
        return 0;
    }

    public void displayAllCompanies() {
        companyDAO.getAllCompanies()
                .forEach(System.out::println);
    }
}
