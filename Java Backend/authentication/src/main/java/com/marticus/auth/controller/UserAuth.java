package com.marticus.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.auth.service.AuthService;
import com.marticus.auth.utility.TokenGen;



@RestController
@RequestMapping("/")
public class UserAuth {
 
	
	@Autowired
	AuthService authService;
	
	
	@GetMapping("login/{userName}/{password}")
	public ResponseEntity<String> login(@PathVariable("userName") String userName
			,@PathVariable("password") String password)
	{
		
		String returnStr="User NOt available";
		boolean result=authService.authenticate(userName,password);
		if(result)
		{
			returnStr=TokenGen.getJWTToken(userName);
		}
		return ResponseEntity.ok(returnStr);
	}
}