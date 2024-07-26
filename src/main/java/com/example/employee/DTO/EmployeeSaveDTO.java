package com.example.employee.DTO;
import java.util.Objects;

public class EmployeeSaveDTO {

    private String employeename;
    private String employeeaddress;
    private int mobile;

    public EmployeeSaveDTO() {
    }

    public EmployeeSaveDTO(String employeename, String employeeaddress, int mobile) {
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.mobile = mobile;
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
            " employeename='" + getEmployeename() + "'" +
            ", employeeaddress='" + getEmployeeaddress() + "'" +
            ", mobile='" + getMobile() + "'" +
            "}";
    }

}