package com.ems.employeeManagementSystem.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.employeeManagementSystem.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
