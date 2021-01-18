/**
 * 
 */
package com.pravin.service;

import java.util.List;

import com.pravin.entity.Employee;

/**
 * @author PravinBhoyar
 *
 */
public interface EmployeeService {
	
	/**
	 * 
	 * @return
	 */
	public List<Employee> getAllEmployee();
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Employee getByEmployeeId(Long id);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Employee deletebyemployeeid(int id);
	/**
	 * 
	 * @param employee
	 * @return
	 */
	public Employee saveemployee(Employee employee);
}
