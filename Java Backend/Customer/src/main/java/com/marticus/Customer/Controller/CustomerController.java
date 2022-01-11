package com.marticus.Customer.Controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.marticus.Customer.Entity.CustomerEntity;
import com.marticus.Customer.Entity.RestData;
import com.marticus.Customer.Service.CustomerService;
import com.marticus.Customer.Utility.JwtToken;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	RestTemplate template;
	
	@PostMapping("/")
	public ResponseEntity<Void> saveCustomer(@RequestBody CustomerEntity customerEntity) 
	{
		customerService.saveCustomer(customerEntity);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerEntity>getCustomer(@PathVariable("id") int id)
	{
		CustomerEntity customerEntity= customerService.findCustomerById(id);
		return ResponseEntity.ok(customerEntity);
	}
	
	@GetMapping("/fetch/{name}")
	public ResponseEntity<CustomerEntity>getCustomerByName(@PathVariable("name") String name)
	{
		CustomerEntity customerEntity= customerService.findCustomerByName(name);
		return ResponseEntity.ok(customerEntity);
	}
	
	@GetMapping("/fetchLike/{name}")
	public ResponseEntity<List<CustomerEntity>> getCustomerLike(@PathVariable String name)
	{
		List<CustomerEntity> custList = customerService.findCustomerByNameContaining(name);
		return ResponseEntity.ok(custList);
	}
	
	@GetMapping("/fetch/{name}/{custAge}")
	public ResponseEntity<List<CustomerEntity>> getCustomerByNameLike(@PathVariable String name
			,@PathVariable int custAge)
	{
		List<CustomerEntity> customerEntity= customerService.findCustomerByNameAndAge(name,custAge);
		return ResponseEntity.ok(customerEntity);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<CustomerEntity>>getAll()
	{
		List<CustomerEntity> custList= customerService.findAllCustomer();
		return ResponseEntity.ok(custList);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>delete(@PathVariable("id") int id)
	{
		String result="Successfully deleted";
		boolean bool=customerService.deleteById(id);
		if(!bool)
		{
			result="Sorry no record found";
		}
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	
	@PutMapping("/")
	public ResponseEntity<CustomerEntity> update(@RequestBody CustomerEntity customerEntity)
	{
		CustomerEntity cust= customerService.update(customerEntity);
		return ResponseEntity.ok(cust);
		
	}
	
	@GetMapping("/login/{username}/{pwd}")
	public ResponseEntity<String> login(@PathVariable String username, 
			@PathVariable String pwd)
	{
		 
//		String str=getJWTToken();
		String str1=JwtToken.getJWTToken();
		
		
		
		return ResponseEntity.ok(str1);
	}
	
	
//	@PostMapping("user")
//	public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
//		
//		String token = getJWTToken(username);
//		User user = new User();
//		user.setUser(username);
//		user.setToken(token);		
//		return user;
//		
//	}
	
	@GetMapping("/callfreeapi")
	public ResponseEntity<RestData> getRestDatas()
	{
		RestData rstdata= new RestData();
		String url="https://www.boredapi.com/api/activity";
		rstdata=template.getForObject(url, RestData.class) ;
		
		return ResponseEntity.ok(rstdata);
		
		
	}
	
	
	
		


	
//	private  String getJWTToken() {
//		String secretKey = "mySecretKey";
//		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
//				.commaSeparatedStringToAuthorityList("ROLE_USER");
//		
//		String token = Jwts
//				.builder()
//				.setId("softtekJWT")
////				.setSubject()
//				.claim("authorities",
//						grantedAuthorities.stream()
//								.map(GrantedAuthority::getAuthority)
//								.collect(Collectors.toList()))
//				.setIssuedAt(new Date(System.currentTimeMillis()))
//				.setExpiration(new Date(System.currentTimeMillis() + 600000))
//				.signWith(SignatureAlgorithm.HS512,
//						secretKey.getBytes()).compact();
//
//		return "Bearer " + token;
//	}

	
	

}
