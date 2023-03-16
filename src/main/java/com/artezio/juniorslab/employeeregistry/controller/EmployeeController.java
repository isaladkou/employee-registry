package com.artezio.juniorslab.employeeregistry.controller;


import com.artezio.juniorslab.employeeregistry.entity.Employee;
import com.artezio.juniorslab.employeeregistry.entity.EmployeeList;
import com.artezio.juniorslab.employeeregistry.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String welcome(){
        System.out.println("welcome");
        return "welcome";
    }

    @GetMapping("/employees")
    public EmployeeList getAll() {
        System.out.println("GET all");
        return new EmployeeList(employeeService.findAll());
    }

    @GetMapping("employees/{id}")
    public Employee findById(@PathVariable Long id){
        System.out.println("GET byId");
        return employeeService.findById(id);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> add(@RequestBody Employee employee) {
        System.out.println("POST add");
        employeeService.add(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
