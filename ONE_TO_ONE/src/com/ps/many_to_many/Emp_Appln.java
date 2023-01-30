package com.ps.many_to_many;

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
		Employee e2=new Employee();
		
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		
		e1.setId(201);
		e1.setName("Suki");
		v1.getEmployee().add(e1);
		v2.getEmployee().add(e1);
		
		e2.setId(202);
		e2.setName("Ram");
		v1.getEmployee().add(e2);
		v2.getEmployee().add(e2);
		
		v1.setV_Id(001);
		v1.setV_Name("nano");
		e1.getVehicle().add(v1);
		e2.getVehicle().add(v1);
		
		v2.setV_Id(002);
		v2.setV_Name("creata");
		e1.getVehicle().add(v2);
		e2.getVehicle().add(v2);
		
		
		
		
		s.save(e1);
		s.save(v1);
		s.save(v2);
		s.save(e2);
		
		
		
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
