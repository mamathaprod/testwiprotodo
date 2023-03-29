package com.sbdemo.sbdemo.service;

import com.sbdemo.sbdemo.entity.Employee;
import com.sbdemo.sbdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void addEmployee(Employee employee)
    {
        repository.save(employee);
    }
    public List<Employee> findAllEmployees()
    {
        return repository.findAll();
    }
    public Optional<Employee> findEmployeeID(Long id)
    {
        return repository.findById(id);
    }
    public void deleteAllData()
    {
        repository.deleteAll();
    }

}
