package com.marticus.auth.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.auth.entity.User;

@Repository
public interface AuthRepository extends JpaRepository<User, Long> {

	List<User> findByUserNameAndPassword(String userName, String password);
	
	

}