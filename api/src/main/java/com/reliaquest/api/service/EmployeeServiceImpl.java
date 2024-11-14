package com.reliaquest.api.service;

import com.reliaquest.api.model.Employee;
import com.reliaquest.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getEmployeesByNameSearch(String name) {
        return repository.findByEmployee_nameLike(name);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(String id) {
        return repository.getById(UUID.fromString(id));
    }

    @Override
    public Integer getHighestSalaryOfEmployees() {
        List<Employee> employeeList = repository.findTop1ByEmployee_salary();
        if (!employeeList.isEmpty()) {
            return employeeList.get(0).getEmployee_salary();
        }
        return 0;
    }

    @Override
    public List<String> getTop10HighestEarningEmployeeNames() {
        List<Employee> employeeList = repository.findTop10ByEmployee_salary();
        return employeeList.stream().map(employee -> employee.getEmployee_name()).collect(Collectors.toList());
    }

    @Override
    public Employee createEmployee(Employee employee) {
        repository.save(employee);
        return employee;
    }

    @Override
    public String deleteEmployeeById(String id) {
        repository.deleteById(UUID.fromString(id));
        return "";
    }
}
