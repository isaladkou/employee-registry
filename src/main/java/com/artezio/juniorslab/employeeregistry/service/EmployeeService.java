package com.artezio.juniorslab.employeeregistry.service;

import com.artezio.juniorslab.employeeregistry.entity.Employee;
import com.artezio.juniorslab.employeeregistry.repository.impl.JpaEmployeeRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmployeeService {
    private final JpaEmployeeRepository repository;

    public EmployeeService(JpaEmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public void add(Employee employee) {
        repository.save(employee);
    }

    public Employee  findById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }


}
