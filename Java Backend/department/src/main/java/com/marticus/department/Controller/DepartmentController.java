package com.marticus.department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.department.Entity.DepartmentEntity;
import com.marticus.department.Repositary.DepartmentRepositary;
import com.marticus.department.Service.DepartmentService;



@RestController
@RequestMapping(path="/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/")
	public ResponseEntity<Void> saveDepartment(@RequestBody DepartmentEntity departmentEntity)
	{
		departmentService.saveDepartment(departmentEntity);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();
	}
	@GetMapping("/{id}")
	public ResponseEntity<DepartmentEntity> getDepartmentById(@PathVariable long id) {

		DepartmentEntity dept=departmentService.findDepartmentById(id);
		return ResponseEntity.ok(dept);
	} 
	@GetMapping("/name/{departmentName}")
	public ResponseEntity<DepartmentEntity> getDepartmentByName(@PathVariable String departmentName) {

		DepartmentEntity dept=departmentService.findDepartmentByDepartmentName(departmentName);
		return ResponseEntity.ok(dept);
	} 
	@GetMapping("/")
	public ResponseEntity<List<DepartmentEntity>> getAllDepartmentslist(){
		List<DepartmentEntity> dept=departmentService.findAllDepartments();
		return ResponseEntity.ok(dept);
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDepartmentById(@PathVariable long id){
	{
		String body="Record deleted succesfully";
		
		Boolean delStatus=departmentService.deleteDepartmentById(id);
		if(!delStatus) {
			body="could not delete the record";
		}
	return ResponseEntity.ok().body(body);
		}
	}
	@PutMapping("/")
	public ResponseEntity<String> updateDepartment(@RequestBody DepartmentEntity dept){
		String strUpdateStatus="data updated successfully";
		departmentService.updateDepartment(dept);
		return ResponseEntity.ok().body("ok");
	}
}

