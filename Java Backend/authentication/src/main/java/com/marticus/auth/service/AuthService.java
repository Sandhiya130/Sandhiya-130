package com.marticus.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.auth.entity.User;
import com.marticus.auth.repo.AuthRepository;

@Service
public class AuthService {

	@Autowired
	AuthRepository authRepository;
	
	public boolean authenticate(String userName, String password) {
		
		List<User> userInfo=authRepository.findByUserNameAndPassword(userName,password);
		System.out.println(userInfo.size());
		if(userInfo!=null && userInfo.size()>0)
		{
			return true;
		}
		
		return false;
	}

	
}