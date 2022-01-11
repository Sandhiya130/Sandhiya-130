package com.marticus.department.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.department.Entity.DepartmentEntity;
@Repository
public interface DepartmentRepositary extends JpaRepository<DepartmentEntity,Long> {
	DepartmentEntity findDepartmentById(long id);
	DepartmentEntity findDepartmentByDepartmentName (String departmentName);

}
