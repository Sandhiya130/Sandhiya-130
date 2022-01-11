package com.javatpoint.mypackage;
import javax.persistence.Column;  

import javax.persistence.DiscriminatorValue;  
import javax.persistence.Entity;  
  
@Entity  
@DiscriminatorValue("Savings")  

public class Savings extends Account{
	
	@Column(name ="interest")
	private float interest;
	

	
	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	// TODO Auto-generated method stub
		
	

	


}
