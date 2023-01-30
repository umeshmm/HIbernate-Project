package com.ps.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Employee1 {
	@Id
	@GeneratedValue
	private int Id;
	private String Name;
	private float salary;
	@ElementCollection
	private Set<Contact> contact=new HashSet<Contact>() ;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Set<Contact> getContact() {
		return contact;
	}
	public void setContact(Set<Contact> contact) {
		this.contact = contact;
	}
}