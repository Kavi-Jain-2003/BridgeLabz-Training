package com.employee.dao;

import com.employee.model.CompanyEmpWage;
import java.util.List;

public interface ICompanyEmpWageDAO {

    void addCompany(CompanyEmpWage company);

    List<CompanyEmpWage> getAllCompanies();
}
