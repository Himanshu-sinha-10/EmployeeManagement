package com.ems.employeeManagementSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ems.employeeManagementSystem.beans.Department;
import com.ems.employeeManagementSystem.beans.Employee;
import com.ems.employeeManagementSystem.beans.User;
import com.ems.employeeManagementSystem.beans.repository.DepartmentRepository;
import com.ems.employeeManagementSystem.beans.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired 
	EmployeeRepository employeeRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User u1 = new User("1234","Employee",10);
		
		Department d1 = new Department("somedepartment");
		
		Employee e1 = new Employee("p","Sinha",LocalDate.now(),"ppppppp1010@gmail.com",d1);
		Employee e2 = new Employee("poooo","Sinha",LocalDate.now(),"poooo1010@gmail.com",d1);

//		e1.setFirstName("HImanshu");
//		e1.setLastName("Sinha");
//		
//		e1.setDob(LocalDate.now());
//		
//		e1.setEmail("himanshusinha1010@gmail.com");
//		e1.setDepartment(d1);
		
//		departmentRepository.save(d1);
		employeeRepository.save(e1);
		employeeRepository.save(e2);

		
		
		
		
		
	}

}
