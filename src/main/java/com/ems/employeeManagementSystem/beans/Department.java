package com.ems.employeeManagementSystem.beans;

import javax.persistence.*;

@Entity
public class Department {
	
	@Id
	@GeneratedValue
	private int deparId;

	private String departName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;
	
	public Department() {}
	public Department(int deparId,String departName) {
		super();
		this.deparId = deparId;
		this.departName = departName;
	}
	
	public Department(String departName) {
		super();
//		this.deparId = deparId;
		this.departName = departName;
	}
	public int getDeparId() {
		return deparId;
	}
	public void setDeparId(int deparId) {
		this.deparId = deparId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	
	@Override
	public String toString() {
		return "Department [deparId=" + deparId + ", departName=" + departName + "]";
	}
	
	

}
