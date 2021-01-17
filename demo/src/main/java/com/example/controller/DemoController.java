
package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

/**
 * @author PravinBhoyar
 *
 */
@RestController
@RequestMapping("/employee")
public class DemoController {
	
	@Autowired
	EmployeeService employeeService;
	
	List<Employee> list = new ArrayList<Employee>();
	Employee emp ;
	
	@GetMapping("/test")
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/getallemployee")
	public ResponseEntity<List<Employee>> getAllEmployeeDetails(){
		List<Employee> list = employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/getbyemployeeid/{id}")
	public ResponseEntity<Employee> getByEmployeeId(@PathVariable("id") Long id){
		Employee emp = employeeService.getByEmployeeId(id);
		return new ResponseEntity<Employee>(emp, new HttpHeaders(), HttpStatus.OK);
	}
	
	
}	
