/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.challange;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Carlos
 */
@Entity
@Table (name = "employee")
public class Employee {
    
    @Id
    private int id;
    
    @Column (name = "name")
    private String name;
    
    @Column (name = "email")
    private String email;
    
    @Column (name = "department")
    private String department;
    
    @Column (name = "salary")
    private double salary;
    
    @Column (name = "birth_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birth_date;

    public Employee() {
    }

    public Employee(int id, String name, String email, String department, double salary, Date birth_date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.birth_date = birth_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + 
                email + ", department=" + department + ", salary=" + salary + 
                ", birth_date=" + birth_date + '}';
    }
    
}
