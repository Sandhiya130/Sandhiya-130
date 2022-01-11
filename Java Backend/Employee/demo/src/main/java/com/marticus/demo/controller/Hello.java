package com.marticus.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/hello")
public class Hello{
	@GetMapping("/first")
		public String sayHello() {
		return "Hello World";
	}
	@GetMapping("/second")
	
	public String sayNext() {
		
	return "Hello World"; 
	}
	@PostMapping(path="/first1")
	 public ResponseEntity<String> save12(String input)
	 {
		
		 HttpHeaders header = new HttpHeaders();
	     header.add("header1", "This is my header 1");
	     header.add("header2", "This is my header 2");
	     return ResponseEntity.status(HttpStatus.CREATED).headers(header).body("Hello");
		
		
	 }
	
	@PostMapping(path="/firsts")
	 public ResponseEntity<String> save(String input)
	 {
		
		 HttpHeaders header = new HttpHeaders();
	     header.add("header1", "This is my header 1");
	     header.add("header2", "This is my header 2");
	     return ResponseEntity.status(HttpStatus.CREATED).headers(header).body("Hello");
		
		
	 }
	 
	 @PostMapping(path="/object")
	 public ResponseEntity<String> save1(String input)
	 {
		 ResponseEntity<String> res1= new ResponseEntity<>("Hello",HttpStatus.OK);
		 	 
	     return res1;
		
		
	 }
	 
	 @PostMapping(path="/inline")
	 public ResponseEntity<String> save11(String input)
	 {
		 return ResponseEntity.status(HttpStatus.CREATED)
				 .header("H1", "Value 1")
				 .header("H2", "Value 2")
				 .body("Test");
		   	
		
	 }
	 
	 @PostMapping(path="/nobody")
	 public ResponseEntity<Void> save111(String input)
	 {
		 return ResponseEntity.status(HttpStatus.CREATED)
				 .header("H1", "Value 1")
				 .header("H2", "Value 2")
				 .build();
		  	
		
	 }
	 @PostMapping(path="/reqhdr")
	 public ResponseEntity<String> reqhdr(        
			 @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
             @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
             @RequestBody String str)
	 		
	 {
		 
		 
//		 String returnVal="X-COM-PERSIST="+headerPersist+"X-COM-LOCATION="+headerLocation;
		 String returnVal="X-COM-PERSIST="+headerPersist+" and " + " X-COM-LOCATION="+headerLocation;
		 return ResponseEntity.ok(returnVal);
		  	
		
	 }
	 @PostMapping(path="/getEmployee")
	 public ResponseEntity<Employee> getEmployee(@RequestBody String input)
	 {
 		 
 		 System.out.println("input="+input);	
 		Employee emp= new Employee("01","sandhiya");
 		 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input)
			 .body(emp);
		   	
		
	 }
	 
	 @PostMapping(path="/getEmployees")
	 public ResponseEntity<List<Employee>> getStudent(@RequestBody String input)
	 {
 		List<Employee> emp=new ArrayList<Employee>(); 
 		
 		Employee em1= new Employee("01","sandhiya");
 		Employee em2= new Employee("02","namm");
 		Employee em3= new Employee("03","priya");
 		 emp.add(em1);
 		 emp.add(em2);
 		 emp.add(em3);
 		 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input)
			 .body(emp);
		   	
		
	 }
	 

	 @PostMapping(path="/processEmployees")
	 public ResponseEntity<Void> processEmployees(@RequestBody List<Employee> employeelist)
	 {
 		 for(Employee emp:employeelist)
 		 {
 			 System.out.println("Name="+emp.getEmpName());
 			 
 		 }
 		
 		
		 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", "Test").build();
		
		   	
		
	 }
	 @PostMapping(path="/getStudent")
	 public ResponseEntity<Student> getStudent1(@RequestBody String input)
	 {
 		 
 		 System.out.println("input="+input);	
 		Student emp= new Student("S01","sandhi");
 		 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input)
			 .body(emp);
		   	
		
	 }
	 
	 @PostMapping(path="/getStudents")
	 public ResponseEntity<List<Student>> getStudents(@RequestBody String input)
	 {
 		List<Student> stu=new ArrayList<Student>(); 
 		
 		Student St01= new Student("S01","sandhi");
 		Student St02= new Student("S02","namm");
 		Student St03= new Student("S03","prii");
 		 stu.add(St01);
 		 stu.add(St02);
 		 stu.add(St03);
 		 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input)
			 .body(stu);
		   	
		
	 }
	 

	 @PostMapping(path="/processStudents")
	 public ResponseEntity<Void> processStudents(@RequestBody List<Student> studentlist)
	 {
 		 for(Student stu:studentlist)
 		 {
 			 System.out.println("Name="+stu.getStudName());
 			 
 		 }
 		
 		
		 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", "Test").build();
		
		   	
		
	 }


	    @GetMapping("/second1/{id}")
	    public int sayHello1(@PathVariable int id)
	   {
		
		return id;
	   }
		
}