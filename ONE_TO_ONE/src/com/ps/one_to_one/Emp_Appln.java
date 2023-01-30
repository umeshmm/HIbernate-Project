package com.ps.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Emp_Appln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory f=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
			Session s=f.openSession();
			Transaction t=s.beginTransaction();
try {
		Employee e1=new Employee();
		e1.setId(001);
		e1.setName("Sumanth");
		
		Vehicle v1=new Vehicle();
		v1.setV_Id(1);
		v1.setV_Name("car");
		
		e1.setVehicle(v1);
		
		Employee e2=new Employee();
		e2.setId(002);
		e2.setName("Rajath");
		
		Vehicle v2=new Vehicle();
		v2.setV_Id(2);
		v2.setV_Name("Jeep");
		
		e2.setVehicle(v2);
		
		s.save(e1);
		s.save(v1);
		s.save(e2);
		s.save(v2);
		
		
		t.commit();  
		System.out.println("successfully saved"); 
	}
	finally
	{

		f.close();
		s.close();
	}
		
		
	
	}

}
