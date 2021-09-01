package com.nikoloz.employee.controllers;


import com.nikoloz.employee.models.Employee;
import com.nikoloz.employee.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    //Yvela employee gamotana
    @GetMapping
    public List<Employee> getAll(){

       return employeeService.getAll();
    }
    //Unikaluri id gamoyenebit konkretuli employee gamotana
    @GetMapping
    @RequestMapping("{id}")
    public Employee get(@PathVariable Long id){

        return employeeService.getById(id);

    }

    //Axali employee damateba
    @PostMapping
    public Employee add(@RequestBody final Employee employee){

        return employeeService.add(employee);
    }
    //Arsebuli employee washla
    @RequestMapping(value = "{id}",method =RequestMethod.DELETE )
    public String delete(@PathVariable Long id){
        employeeService.delete(id);
        return "Employee deleted Successfully!";
    }
    //Arsebuli employee ganaxleba json gamoyenebit
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public Employee update(@PathVariable Long id,@RequestBody Employee employee){

        return employeeService.update(employee,id);
    }

}
