package com.example.employee.EmployeeRepo;
import com.example.employee.Entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
//Remove @RepositoryRestResource below to disable auto REST api:


@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{}
