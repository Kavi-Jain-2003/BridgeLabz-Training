package com.employee.dao;

import com.employee.model.CompanyEmpWage;
import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWageDAOImpl implements ICompanyEmpWageDAO {

    private List<CompanyEmpWage> companyList = new ArrayList<>();

    @Override
    public void addCompany(CompanyEmpWage company) {
        companyList.add(company);
    }

    @Override
    public List<CompanyEmpWage> getAllCompanies() {
        return companyList;
    }
}
