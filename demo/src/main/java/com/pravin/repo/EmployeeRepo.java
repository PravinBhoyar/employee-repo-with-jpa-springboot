package com.pravin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pravin.entity.Employee;

/**
 * 
 * @author PravinBhoyar
 *
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
