package com.nikoloz.employee.services;


import com.nikoloz.employee.models.Employee;
import com.nikoloz.employee.repositories.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
       return employeeRepository.findAll();
    }

    @Override
    public Employee add(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    @Override
    public Employee getById(Long id) {

      return employeeRepository.getById(id);

    }

    @Override
    public Employee update(Employee employee,Long id) {
        Employee existing = employeeRepository.getById(id);
        BeanUtils.copyProperties(employee,existing,"id");
        return  employeeRepository.saveAndFlush(existing);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);

    }
}
