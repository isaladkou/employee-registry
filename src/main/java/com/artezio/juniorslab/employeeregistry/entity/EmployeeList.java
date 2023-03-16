package com.artezio.juniorslab.employeeregistry.entity;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeList extends ArrayList<Employee> {
    public EmployeeList(Collection<? extends Employee> c) {
        super(c);
    }
}
