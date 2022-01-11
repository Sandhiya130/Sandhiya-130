package com.springmvcexample.utility;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator cal=new Calculator();
		assertTrue(cal.add(8, 7)==14);
		
	}
@Test
	public void testSub() {
		Calculator cal=new Calculator();
		assertTrue(cal.sub(8, 7)==1);
		

}
}

