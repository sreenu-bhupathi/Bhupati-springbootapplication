package com.first1.Employee_info.controller;

import com.first1.Employee_info.Model.Employee;
import com.first1.Employee_info.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {
    @Autowired
    private Employeeservice service;

    @PostMapping("/addemp")

    public Employee addEmployee(@RequestBody Employee employee)
    {
        return service.addEmployee(employee);
    }

}
