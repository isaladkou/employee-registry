package com.artezio.juniorslab.employeeregistry.repository;

import com.artezio.juniorslab.employeeregistry.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> getAll();

    void add(Employee employee);
}
