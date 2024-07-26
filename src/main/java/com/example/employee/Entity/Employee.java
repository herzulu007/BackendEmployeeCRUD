package com.example.employee.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeid;

    @Column(name = "employee_name")
    private String employeename;

    @Column(name = "employee_adreess")
    private String employeeaddress;
    
    @Column(name = "employee_mobile")
    private int mobile;


    public Employee() {
    }

    public Employee(int employeeid, String employeename, String employeeaddress, int mobile) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.mobile = mobile;
    }
    
    public Employee(String employeename, String employeeaddress, int mobile) {
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.mobile = mobile;
    }

    public int getEmployeeid() {
        return this.employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return this.employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeaddress() {
        return this.employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }

    public int getMobile() {
        return this.mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "{" +
            " employeeid='" + getEmployeeid() + "'" +
            ", employeename='" + getEmployeename() + "'" +
            ", employeeaddress='" + getEmployeeaddress() + "'" +
            ", mobile='" + getMobile() + "'" +
            "}";
    }


}
