package com.sbdemo.sbdemo.repository;


import java.util.List;

import com.sbdemo.sbdemo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findAll();

    Employee findById(long id);
    void deleteAll();
    Employee save(Employee employee);
}
