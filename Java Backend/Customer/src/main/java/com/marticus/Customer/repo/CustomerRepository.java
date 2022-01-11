package com.marticus.customer.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marticus.customer.entity.CustomerEntity;



public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>
{
	
	CustomerEntity findCustomerById(long id);

	List<CustomerEntity> findCustomerByCustomerName(String name);

	List<CustomerEntity> findCustomerByCustomerNameContaining(String name);

	List<CustomerEntity> findCustomerByCustomerNameContainingAndCustomerCode(String name, String custId);
 
}
