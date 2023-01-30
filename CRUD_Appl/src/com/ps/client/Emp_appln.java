package com.ps.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emp_appln {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=null;
	
 class Insert_Employee {
		public void  Insert()
		{
			String ch="n";
		do {
			Scanner sc=new Scanner(System.in);
			Transaction t=null;
			t=s.beginTransaction();
			Employee e=new Employee();
			System.out.println("Enter the Employee number");
			e.setId(sc.nextInt());
			System.out.println("Enter the Employee name");
			e.setName(sc.next());
			System.out.println("Enter the Employee salary/month");
			e.setSalary(sc.nextFloat());
			s.save(e);
			t.commit();
			System.out.println("One record inserted sucessfully;");
			System.out.println("Do you want to insert more records?? y/n");
			
			ch=sc.next();
		}while (ch.equalsIgnoreCase("y")|ch.equalsIgnoreCase("yes"));
		}
}
		
		class Select_Employee{
			public void Select() {
				Scanner sc=new Scanner(System.in);
				// TODO Auto-generated method stub
				System.out.println("Enter the Employee number");
				//Employee e=(Employee)s.load(Employee.class, sc.nextInt());
				Employee e=(Employee)s.get(Employee.class, sc.nextInt());
				System.out.println("Employee Number is "+ e.getId());
				System.out.println("Employee Name is "+e.getName());
				System.out.println("Employee salary is "+e.getSalary());

			}

		}
	class Update_Employee{
		public void Update(){
			Scanner sc=new Scanner(System.in);
			// TODO Auto-generated method stub
			Transaction t=null;
				t=s.beginTransaction();
			System.out.println("Enter the Employee number");
			Employee e=(Employee)s.get(Employee.class, sc.nextInt());
			
			if(e !=null) {
				System.out.println("Enter new salary to upadate");
				e.setSalary(sc.nextFloat());
				s.update(e);
				t.commit();
				System.out.println("One record updated sucessfully");
			}else {
				System.out.println("Record not found");
			}
		  }
	}
class Delete_Employee{
		public void Delete() {
			Scanner sc=new Scanner(System.in);
			// TODO Auto-generated method stub
			Transaction t=null;
			
			t=s.beginTransaction();
			System.out.println("Enter the Employee number");
			Employee e=(Employee)s.get(Employee.class, sc.nextInt());
			
			if(e !=null) {
				s.delete(e);
				t.commit();
				System.out.println("One record updated sucessfully");
			}else {
				System.out.println("Record not found");
			}
		}

	}

		
		
	do {	
		System.out.println("*******************CRUD DEMO*****************");
		System.out.println("1--Insert 2--Select 3--Update 4--Delete 5--exit");
		System.out.println("Enter ur choice");
		Scanner sc=new Scanner(System.in);
		int  choice=sc.nextInt();
		switch(choice)
		{
		case 1:Insert_Employee e=new Insert_Employee();
				e.Insert(); break;
		case 2:Select_Employee e1=new Select_Employee();
				e1.Select();break;
		case 3:Update_Employee e2=new Update_Employee();
				e2.Update();break;
		case 4:Delete_Employee e3=new Delete_Employee();
				e3.Delete();break;
		case 5: System.exit(1);
		
		default: System.out.println("1--Insert 2--Select 3--Update 4--Delete 5--exit");
		}
	}while(true);
	
	}

}
