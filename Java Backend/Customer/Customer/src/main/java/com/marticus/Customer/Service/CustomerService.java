package com.marticus.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.marticus.Customer.Repositary.CustomerRepositary;
import com.marticus.Customer.Entity.CustomerEntity;
import com.marticus.Customer.Security.JWTAuthorizationFilter;
import com.marticus.Customer.Utility.JwtToken;

@Service
public class CustomerService {

	@Autowired
	CustomerRepositary customerRepositary;
	
	
	public void saveCustomer(CustomerEntity customerEntity) {
		// TODO Auto-generated method stub
		customerRepositary.save(customerEntity);
	}
		
	
	public CustomerEntity findCustomerById(int id)
	{
		return customerRepositary.findCustomerById(id);
		
	}


	public CustomerEntity findCustomerByName(String name) {
		// TODO Auto-generated method stub
		return customerRepositary.findCustomerByName(name);
	}


	public List<CustomerEntity> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepositary.findAll(Sort.by(Sort.Direction.ASC,"name"));
	}


	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity=customerRepositary.getById(id);
		if(customerEntity!=null)
		{
			customerRepositary.delete(customerEntity);
			return true;
		}
		return false;
		
	}


	public CustomerEntity update(CustomerEntity customerEntity) {
		// TODO Auto-generated method stub
		CustomerEntity entityInPersistState = customerRepositary.findCustomerById(customerEntity.getId());
		entityInPersistState.setName(customerEntity.getName());
		entityInPersistState.setAge(customerEntity.getAge());
		customerRepositary.save(entityInPersistState);
		return entityInPersistState;
	}


	public List<CustomerEntity> findCustomerByNameContaining(String name) {
		return customerRepositary.findCustomerByNameContaining(name);
	}


	public List<CustomerEntity> findCustomerByNameAndAge(String name, int custAge) {
		// TODO Auto-generated method stub
		return customerRepositary.findCustomerByNameAndAge(name,custAge);
	}


	
	///overWriting the customer object itself
//	public CustomerEntity update(CustomerEntity customerEntity) {
//		// TODO Auto-generated method stub
//		customerRepo.save(customerEntity);
//		return customerEntity;
//	}
	
	
	
}
