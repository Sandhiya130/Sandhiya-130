package com.marticus.demo.controller;

public class Employee {

	String empId;
	String empName;
	
	
	public Employee(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
