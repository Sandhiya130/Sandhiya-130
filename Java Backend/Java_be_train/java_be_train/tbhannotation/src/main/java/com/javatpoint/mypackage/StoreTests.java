package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreTests {
	public static void main(String args[])
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		 Transaction t=session.beginTransaction();  
		 
		 
		 Savings s=new Savings();  
		    
		  
		   s.setId(11);
		   s.setName("tom");
		    s.setInterest(20);  
		    
		      
		   Current c=new Current();  
		     
		    c.setId(12); 
		    c.setName("jerry");
		    c.setOverdraftAmount(1500);  
		    //session.persist(e1);  
		    session.persist(s);  
		    session.persist(c);  
		      
		    t.commit();  
		    session.close();  
		    System.out.println("success");  
		      
		 
	}	 
}
