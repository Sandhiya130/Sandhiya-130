package com.marticus.Employee.EmployeDao;


	import java.util.List;

import com.marticus.Employee.Entity.EmployeeEntity;

	public interface EmployeeDAO {

		public void addEmployee(EmployeeEntity employee);

		public List<EmployeeEntity> getAllEmployees();

		public void deleteEmployee(Integer employeeId);

		public EmployeeEntity updateEmployee(EmployeeEntity employee);

		public EmployeeEntity getEmployee(int employeeid);
	}



