package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movies;

public class Client {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction transaction=session.beginTransaction();
	
	
	Movies m1=new Movies();
	m1.setMid(1);
	m1.setMoviename("pk");
	
	Movies m2=new Movies();
	m2.setMid(2);
	m2.setMoviename("lagan");
	
	Set<Movies> set=new HashSet<Movies>();
	set.add(m1);
	set.add(m2);

	Actor a=new Actor();
	a.setAid(1);
	a.setActorname("ameerkhan");
	a.setMovies(set);
	
	
	//session.save(m1);
	//session.save(m2);
	session.save(a);
	transaction.commit();
	System.out.println("insertion success");
	
	
	
}
}
