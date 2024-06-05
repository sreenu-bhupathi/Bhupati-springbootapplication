package com.first1.Employee_info.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //setters and getters (came from long book
@NoArgsConstructor //no need to create a constructor
@AllArgsConstructor

public class Employee {
    @Id // to create primary key in every set of data
    public int id;
    public String empid;
    public String image;
    public String name;
    public String dep;
    public String desig;
    public String email;
    public String phone;
    public String address;
    public String salary;

}
