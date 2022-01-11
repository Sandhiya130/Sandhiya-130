package com.marticus;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("FirstAnno")
@Scope("prototype")
public class FirstAnno {

	void Test()
	{
		System.out.println("Hello World Spring DI with Annotation");
		
		
	}
	
	
}
