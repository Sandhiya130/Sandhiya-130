package com.marticus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class SpringDependencyExample {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(); 
		appContext.scan("com.marticus");
		appContext.refresh();
 	 
 
		Second s = (Second) appContext.getBean("Second");
		//f.Test(); 
		
		s.getThird().sayhello();
		 
	}
}

