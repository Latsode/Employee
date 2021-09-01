package com.nikoloz.employee.services;

import com.nikoloz.employee.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee add(Employee employee);
    Employee getById(Long id);
    Employee update(Employee employee,Long id);
    void delete(Long id);
}
