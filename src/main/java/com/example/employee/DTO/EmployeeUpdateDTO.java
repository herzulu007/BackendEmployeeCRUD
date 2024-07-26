package com.example.employee.DTO;
import java.util.Objects;

public class EmployeeUpdateDTO {
    private int employeeid;
    private String employeename;
    private String employeeaddress;
    private int mobile;

    public EmployeeUpdateDTO() {
    }

    public EmployeeUpdateDTO(int employeeid, String employeename, String employeeaddress, int mobile) {
        this.employeeid = employeeid;
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
