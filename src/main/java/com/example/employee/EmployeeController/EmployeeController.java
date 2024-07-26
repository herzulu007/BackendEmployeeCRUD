package com.example.employee.EmployeeController;

import com.example.employee.DTO.EmployeeDTO;
import com.example.employee.DTO.EmployeeSaveDTO;
import com.example.employee.DTO.EmployeeUpdateDTO;
import com.example.employee.Service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;



    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO)
    {
        String id = employeeService.addEmployee(employeeSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllEmployee")
    public List<EmployeeDTO> getAllEmployee()
    {
        List<EmployeeDTO> allEmployees = employeeService.getAllEmployee();
        return allEmployees;
    }

    @PutMapping(path = "/update")

    public String updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO)
    {
        String id = employeeService.updateEmployees(employeeUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deleteemployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id)
    {
        boolean deleteemployee = employeeService.deleteEmployee(id);
        return "deleted";
    }

}
