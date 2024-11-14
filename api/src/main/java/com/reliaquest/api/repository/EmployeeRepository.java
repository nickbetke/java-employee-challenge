package com.reliaquest.api.repository;

import com.reliaquest.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    List<Employee> findTop1ByEmployee_salary();

    List<Employee> findTop10ByEmployee_salary();

    List<Employee> findByEmployee_nameLike(String name);
}
