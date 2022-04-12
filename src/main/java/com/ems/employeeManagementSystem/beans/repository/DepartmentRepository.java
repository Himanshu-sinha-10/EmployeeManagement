package com.ems.employeeManagementSystem.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.employeeManagementSystem.beans.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
