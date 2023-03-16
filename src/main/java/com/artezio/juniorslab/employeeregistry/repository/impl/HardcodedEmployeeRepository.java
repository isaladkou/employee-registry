package com.artezio.juniorslab.employeeregistry.repository.impl;

import com.artezio.juniorslab.employeeregistry.entity.Employee;
import com.artezio.juniorslab.employeeregistry.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HardcodedEmployeeRepository implements EmployeeRepository {

    private List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee(1L, "Ivan", "Saladkou", "Junior java Developer"),
            new Employee(2L, "Olga", "Bykova", "Junior js Developer"),
            new Employee(3L, "Dmitry", "Kovalenko", "Senior Java developer")
    ));


    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }
}


