package com.marticus.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.Customer.Entity.CustomerEntity;
import com.marticus.Customer.Repositary.CustomerRepositary;

@Service
public class CustomerService {
	@Autowired
	CustomerRepositary customerRepositary;
	

	public void saveCustomer(CustomerEntity customerEntity) {
		// TODO Auto-generated method stub
		customerRepositary.save(customerEntity);
	}


	public CustomerEntity findCustomerById(long id) {
		// TODO Auto-generated method stub
		return customerRepositary.findCustomerById(id);
	}


	public CustomerEntity findCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return customerRepositary.findCustomerByCustomerName(customerName);
	}


	public List<CustomerEntity> findAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepositary.findAll();
	}


	public Boolean deleteCustomerById(long id) {
		// TODO Auto-generated method stub
		CustomerEntity cust=customerRepositary.findCustomerById(id);
		if(cust!=null)
		{
			customerRepositary.delete(cust);
			return true;
		}
		return false;
	}


	public void updateCustomer(CustomerEntity cust) {
		// TODO Auto-generated method stub
		CustomerEntity custDB=customerRepositary.findCustomerById(cust.getId());
		custDB.setCustomerCode(cust.getCustomerCode());
		custDB.setCustomerName(cust.getCustomerName());
		customerRepositary.save(custDB);
	}
	
	

}
