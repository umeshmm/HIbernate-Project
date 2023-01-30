package test;

import java.util.HashSet;
import java.util.Set;

import model.Course;
import model.Faculty;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("scjp");
		c1.setFee(2000);

		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("struts");
		c2.setFee(1500);

		Course c3 = new Course();
		c3.setCid(3);
		c3.setCname("spring");
		c3.setFee(1500);

		Course c4 = new Course();
		c4.setCid(4);
		c4.setCname("Hibernate");
		c4.setFee(1500);

		Set<Course> cset = new HashSet<Course>();
		cset.add(c1);
		cset.add(c2);

		Set<Course> cset1 = new HashSet<Course>();
		cset1.add(c2);
		cset1.add(c3);
		cset1.add(c4);

		Faculty f1 = new Faculty();
		f1.setFid(1);
		f1.setFname("durga");
		f1.setYearex(10);
		f1.setCourses(cset);

		Faculty f2 = new Faculty();
		f2.setFid(2);
		f2.setFname("srikanth");
		f2.setYearex(5);
		f2.setCourses(cset);

		Faculty f3 = new Faculty();
		f3.setFid(3);
		f3.setFname("naveen");
		f3.setYearex(4);
		f3.setCourses(cset1);

		s.saveOrUpdate(f1);
		s.saveOrUpdate(f2);
		s.saveOrUpdate(f3);		
		s.saveOrUpdate(c1);
		s.saveOrUpdate(c2);
		s.saveOrUpdate(c3);
		s.saveOrUpdate(c4);
		t.commit();
		System.out.println("success");
		sf.close();
	}

}
