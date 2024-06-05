package com.first1.Employee_info.repository;

import com.first1.Employee_info.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer> {
}
