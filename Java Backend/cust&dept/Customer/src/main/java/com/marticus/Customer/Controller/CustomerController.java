package com.marticus.Customer.Controller;

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

import com.marticus.Customer.Entity.CustomerEntity;
import com.marticus.Customer.Repositary.CustomerRepositary;
import com.marticus.Customer.Service.CustomerService;



@RestController
@RequestMapping(path="/cust")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/")
	public ResponseEntity<Void> saveCustomer(@RequestBody  CustomerEntity customerEntity)
	{
		customerService.saveCustomer(customerEntity);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();
	}
	@GetMapping("/{id}")
	public ResponseEntity<CustomerEntity> getCustomerById(@PathVariable long id) {

		CustomerEntity cust=customerService.findCustomerById(id);
		return ResponseEntity.ok(cust);
	} 
	@GetMapping("/name/{customerName}")
	public ResponseEntity<CustomerEntity> getCustomerByName(@PathVariable String customerName) {

		CustomerEntity cust=customerService.findCustomerByName(customerName);
		return ResponseEntity.ok(cust);
	} 
	@GetMapping("/")
	public ResponseEntity<List<CustomerEntity>> getAllCustomerslist(){
		List<CustomerEntity> cust=customerService.findAllCustomers();
		return ResponseEntity.ok(cust);
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable long id){
	{
		String body="Record deleted succesfully";
		
		Boolean delStatus=customerService.deleteCustomerById(id);
		if(!delStatus) {
			body="could not delete the record";
		}
	return ResponseEntity.ok().body(body);
		}
	}
	@PutMapping("/")
	public ResponseEntity<String> updateCustomer(@RequestBody CustomerEntity cust){
		String strUpdateStatus="data updated successfully";
		customerService.updateCustomer(cust);
		return ResponseEntity.ok().body("ok");
	}
}

