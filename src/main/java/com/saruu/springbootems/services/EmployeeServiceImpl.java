package com.saruu.springbootems.services;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saruu.springbootems.entities.Employee;
import com.saruu.springbootems.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional=employeeRepository.findById(id);
		Employee employee=null;
		System.out.println(id);
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new RuntimeException("Employee not found for the id :: "+id);
		}
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
		this.employeeRepository.deleteById(id);
		
	}

	
	
	
}


