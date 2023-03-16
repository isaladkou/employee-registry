package com.artezio.juniorslab.employeeregistry.repository.impl;

import com.artezio.juniorslab.employeeregistry.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEmployeeRepository extends JpaRepository<Employee, Long> {
}
