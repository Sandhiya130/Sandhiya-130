package com.marticus.Employee.Service;

import java.util.List;



import com.marticus.Employee.Entity.EmployeeEntity;

public interface EmployeeService {
	
	public void addEmployee(EmployeeService employee);

	public List<EmployeeEntity> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public EmployeeEntity getEmployee(int employeeid);

	public EmployeeEntity updateEmployee(EmployeeEntity employee);
}
