package com.example.task3;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public Iterable<Employee> findAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee addOneEmployee(@RequestBody Employee employee) {

        return this.employeeRepository.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestParam(value = "id") Integer id,@RequestParam(value = "firstName") String firstName){

        Employee e = this.employeeRepository.findById(id).get();
        e.setFirstName(firstName);
        return  this.employeeRepository.save(e);
    }

}