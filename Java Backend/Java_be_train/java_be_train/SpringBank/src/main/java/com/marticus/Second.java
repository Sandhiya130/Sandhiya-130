package com.marticus;

public class Second {
	private  Third third;
	

	public Third getThird() {
		return third;
	}


	public void setThird(Third third) {
		this.third = third;
	}


	void Test() {
		
		System.out.println("Hello from Injected bean 2!!!");
		
	}
	
}
