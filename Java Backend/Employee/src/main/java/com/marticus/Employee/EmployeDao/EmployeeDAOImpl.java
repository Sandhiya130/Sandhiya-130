package com.marticus.Employee.EmployeDao;



	import java.util.List;



	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.marticus.Employee.Entity.EmployeeEntity;
import com.marticus.Employee.Service.EmployeeService;
	


	@Repository
	public class EmployeeDAOImpl implements EmployeeDAO {

		@Autowired
		private SessionFactory sessionFactory;

		public void addEmployee(EmployeeService employee) {
			sessionFactory.getCurrentSession().saveOrUpdate(employee);

		}

		@SuppressWarnings("unchecked")
		public List<EmployeeEntity> getAllEmployees() {

			return sessionFactory.getCurrentSession().createQuery("from Employee")
					.list();
		}

		@Override
		public void deleteEmployee(Integer employeeId) {
			EmployeeEntity employee = (Employee) sessionFactory.getCurrentSession().load(
					EmployeeEntity.class, employeeId);
			if (null != employee) {
				this.sessionFactory.getCurrentSession().delete(employee);
			}

		}

		public Employee getEmployee(int empid) {
			return (Employee) sessionFactory.getCurrentSession().get(
					Employee.class, empid);
		}

		@Override
		public Employee updateEmployee(Employee employee) {
			sessionFactory.getCurrentSession().update(employee);
			return employee;
		}

		@Override
		public void addEmployee(EmployeeEntity employee) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public EmployeeEntity updateEmployee(EmployeeEntity employee) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public EmployeeEntity getEmployee(int employeeid) {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
