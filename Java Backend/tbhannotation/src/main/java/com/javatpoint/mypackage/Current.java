package com.javatpoint.mypackage;
import javax.persistence.Column;  

import javax.persistence.DiscriminatorValue;  
import javax.persistence.Entity;
@Entity  
@DiscriminatorValue("Current")  
public class Current extends Account{

	@Column(name ="overdraftAmount")
	private int overdraftAmount;

	public int getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(int overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	



}
