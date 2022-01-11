package com.marticus.department.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.department.Entity.DepartmentEntity;
import com.marticus.department.Repositary.DepartmentRepositary;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepositary departmentRepositary;
	

	public void saveDepartment (DepartmentEntity departmentEntity) {
		// TODO Auto-generated method stub
		departmentRepositary.save(departmentEntity);
	}


	public DepartmentEntity findDepartmentById(long id) {
		// TODO Auto-generated method stub
		return departmentRepositary.findDepartmentById(id);
	}


	public DepartmentEntity findDepartmentByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepositary.findDepartmentByDepartmentName(departmentName);
	}


	public List<DepartmentEntity> findAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepositary.findAll();
	}


	public Boolean deleteDepartmentById(long id) {
		// TODO Auto-generated method stub
		DepartmentEntity dept=departmentRepositary.findDepartmentById(id);
		if(dept!=null)
		{
			departmentRepositary.delete(dept);
			return true;
		}
		return false;
	}


	public void updateDepartment (DepartmentEntity dept) {
		// TODO Auto-generated method stub
		DepartmentEntity deptDB=departmentRepositary.findDepartmentById(dept.getId());
		deptDB.setDepartmentCode(dept.getDepartmentCode());
		deptDB.setDepartmentName(dept.getDepartmentName());
		departmentRepositary.save(deptDB);
	}
	
	

}
