package com.ps.client;

import java.awt.List;
import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class Select_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	
//		//from
//		Query q1=s.createQuery("from Employee");//here persistent class name is Emp  
//	    java.util.List l1= q1.list();  
//		System.out.println("Size of list is "+l1.size());
//		
//		System.out.println("Employee details are");
//		  Query query = s.createQuery("from Employee e");
//			
//		  java.util.List<Employee>list=query.list();
//		  for (Employee e:list)
//		  {  System.out.println("Employee ID: " + e.getId());
//			 System.out.println("Employee Name: " + e.getName());
//			 System.out.println("Employee Salary: " + e.getSalary());
//		  }
//		
//		//where
//		Query q2=s.createQuery("from Employee where id>103");//here persistent class name is Emp  
//	    java.util.List l2= q2.list();  
//		System.out.println("Size of list is "+l2.size());
//		//delete
//		//Query q3=s.createQuery("delete from Employee where id=105");  
//		//q3.executeUpdate();  
		
//		//Example to get maximum salary of employee
//		Query maxQuery=s.createQuery("select max(salary) from Employee");  
//		System.out.println("Maximun salary in list : " + maxQuery.list().get(0));
//		//Example to get minimum salary of employee
//		Query minQuery=s.createQuery("select min(salary) from Employee");  
//		System.out.println("Minimum salary in list : " + minQuery.list().get(0));
//		//Example to count total number of employee ID
//		Query countQuery=s.createQuery("select count(id) from Employee");  
//		System.out.println("Total no of Employee is : " + countQuery.list().get(0));
//		//Example to get average salary of each employees
//		Query avgQuery=s.createQuery("select avg(salary) from Employee"); 
//		System.out.println("Average salary of Employee is : " + avgQuery.list().get(0));
		
//		//pagination
//		Query q4=s.createQuery(" from Employee ");  
//		q4.setFirstResult(4);
//		q4.setMaxResults(4);
//		java.util.List<Employee>l4=q4.list();
//		  for (Employee e:l4)
//		  {  System.out.println("Employee ID: " + e.getId());
//			 System.out.println("Employee Name: " + e.getName());
//			 
//		  }
		  
//		//named query
//		  Query q5=s.getNamedQuery("Employee.byID").setInteger("id", 105);
//		  //q5.setInteger(0, 103);
//		  java.util.List<Employee>l5=q5.list();
//		  for (Employee e:l5)
//		  {  System.out.println("Employee ID: " + e.getId());
//			 System.out.println("Employee Name: " + e.getName());
//			 
//		  }
		  
		 //crieteria API
		  
		  //Criteria c1=s.createCriteria(Employee.class);//passing Class class argument  
		  //java.util.List l6=c1.list();
		 // System.out.println("Size of list is "+l6.size());
		  
	
//		   Criteria c10=s.createCriteria(Employee.class);  
//		  //c10.add(Restrictions.le("id", 105));
//		  c10.addOrder(Order.asc("salary"));  
//		  java.util.List<Employee> e10=c10.list(); 
//		  for(Employee employee : e10)
//		    {
//			  System.out.println("Employee Name: " + employee.getName());
//			  System.out.println("Employee Salary: " + employee.getSalary());
//		    }
		
		
		Employee e=new Employee();
		//e.setId(109);
//	e.setName("Suraj");
//	e.setSalary(70000);
		//now its transient objct
		
		//update the users name here
		s.save(e);
		//now its persistance objct
		//update the user here
		
		
//		e.setName("Ramya");
//		e.setSalary(20000);
//		
//		e.setName("divya");
//		e.setSalary(20000);
//		
//		e.setName("shilpa");
//		e.setSalary(20000);
//		t.commit();
//		s.close();
//		
//		e.setName("Prakruthi");
//		e.setSalary(20000);
		    
		//detatched to persistance state
		e.setName("Suraj");
		e.setSalary(70000);
		s.save(e);
		//pulled data from DB to user
		Employee emp=s.get(Employee.class , 1);
		t.commit();
		s.close();
		
		//waiting for user input
		emp.setName("sharth");
		
		 s=sf.openSession();
		 t=s.beginTransaction();
		 s.update(emp);
		 t.commit();
		s.close();
	  
		  
	}
}


