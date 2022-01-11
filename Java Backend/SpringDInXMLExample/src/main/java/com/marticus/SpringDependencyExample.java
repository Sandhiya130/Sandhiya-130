package com.marticus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyExample {

	public static void main(String[] args) {
		
		ApplicationContext appContext
			= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		 
		
		GeometryRect geometryBean1=(GeometryRect)appContext.getBean("geometry1");
		geometryBean1.drawShape();
		
		 
		
//		GeometryRect geometryRectBean=(GeometryRect)appContext.getBean("geometry1");
//		geometryRectBean.drawShape();
//		System.out.println(geometryRectBean);
//		
//		GeometryRect geometryRectBean11=(GeometryRect)appContext.getBean("geometry1");
//		System.out.println(geometryRectBean11);
//		
//		if(geometryRectBean!=geometryRectBean11)
//		{
//			System.out.println("Not same bean");
//			
//		}
		
		
		 
	}

}
