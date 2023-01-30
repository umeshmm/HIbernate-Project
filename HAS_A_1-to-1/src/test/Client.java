package test;

import java.util.Date;

import model.Vote;
import model.Voter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Voter v=new Voter();
		v.setVid(111);
		v.setVname("abc");
		v.setVage(25);
		
		Vote vt1=new Vote();
		vt1.setPname("bdp");
		vt1.setCdate(new Date());
		vt1.setVoter(v);
		
		Vote vt2=new Vote();
		vt2.setPname("bdp");
		vt2.setCdate(new Date());
		vt2.setVoter(v);
		
		
		
		
		s.save(v);
		s.save(vt1);
	/*	s.save(vt2);*/
		s.beginTransaction().commit();
		sf.close();
		System.out.println("success");
		
		
		
	}

}
