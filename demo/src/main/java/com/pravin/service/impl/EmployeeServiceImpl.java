/**
 * 
 */
package com.pravin.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravin.entity.Employee;
import com.pravin.repo.EmployeeRepo;
import com.pravin.service.EmployeeService;

/**
 * @author pravinBhoyar
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo employeerepo;

	@Override
	public List<Employee> getAllEmployee() {
		 List<Employee> emplist =   employeerepo.findAll();
		 if(!emplist.isEmpty() && emplist.size() > 0) {
			 return emplist;
		 }else {
			 return null;
		 }
	}

	@Override
	public Employee  getByEmployeeId(Long id) {
		Optional<Employee> emp =  employeerepo.findById(id);
		 if(emp.isPresent()){
			return emp.get();
		}else {
			System.out.println("No employee record exist for given id");
		}
		return null;
	}

	@Override
	public Employee deletebyemployeeid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee saveemployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
