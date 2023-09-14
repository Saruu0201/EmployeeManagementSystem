package com.saruu.springbootems.services;

import java.util.List;


import com.saruu.springbootems.entities.Employee;

public interface EmployeeService {
 List<Employee> getAllEmployee();
 void saveEmployee(Employee employee);
 Employee getEmployeeById(int id);
 void deleteEmployee(int id);
}
