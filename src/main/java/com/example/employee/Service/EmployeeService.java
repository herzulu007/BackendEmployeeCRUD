package com.example.employee.Service;
import com.example.employee.DTO.EmployeeDTO;
import com.example.employee.DTO.EmployeeSaveDTO;
import com.example.employee.DTO.EmployeeUpdateDTO;

import java.util.List;
public interface EmployeeService {
    String addEmployee(EmployeeSaveDTO employeeSaveDTO);

    List<EmployeeDTO> getAllEmployee();

    String updateEmployees(EmployeeUpdateDTO employeeUpdateDTO);

    boolean deleteEmployee(int id);
}