package com.marticus.Customer.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.Customer.Entity.CustomerEntity;


@Repository
public interface CustomerRepositary extends JpaRepository<CustomerEntity,Long> {
	CustomerEntity findCustomerById(long id);

	CustomerEntity findCustomerByCustomerName(String customerName);

}
