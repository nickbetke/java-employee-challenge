package com.reliaquest.api.service;

import com.reliaquest.api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface EmployeeService {

    List<Employee> getEmployeesByNameSearch(String name);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    Integer getHighestSalaryOfEmployees();

    List<String> getTop10HighestEarningEmployeeNames();

    Employee createEmployee(Employee employee);

    String deleteEmployeeById(String id);
}
