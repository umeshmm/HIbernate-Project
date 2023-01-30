package com.ps.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Employee1_Appln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee1.class)
				.buildSessionFactory();
			Session s=f.openSession();
			Transaction t=s.beginTransaction();
			
			Employee1 e=new Employee1();
			e.setName("Umesh");
			e.setSalary(40000);
			
			Contact c1=new Contact();
			c1.setEmail("Umesh@gmail.com");
			c1.setMobile("9886045367");
						
			Contact c2=new Contact();
			c2.setEmail("Umesh@yahoo.com");
			c2.setMobile("9886045367");
			
			e.getContact().add(c1);
			e.getContact().add(c2);
			
			s.save(e);
			t.commit();
			

	}

}
