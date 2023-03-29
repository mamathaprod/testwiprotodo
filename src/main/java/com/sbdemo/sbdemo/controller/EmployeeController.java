package com.sbdemo.sbdemo.controller;

import com.sbdemo.sbdemo.entity.Employee;
import com.sbdemo.sbdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping("/findall")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/findbyid/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable long id) {
        return employeeService.findEmployeeID(id);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee() {
        employeeService.deleteAllData();
    }
}
