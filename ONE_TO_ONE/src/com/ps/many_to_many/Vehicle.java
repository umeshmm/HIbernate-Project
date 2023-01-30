package com.ps.many_to_many;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	@Id
	private int v_Id;
	private String v_Name;
	//@ManyToMany
	@ManyToMany(mappedBy = "vehicle")
	
	private Collection<Employee> employee=new ArrayList<Employee>();
	
	public Collection<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Collection<Employee> employee) {
		this.employee = employee;
	}
	public int getV_Id() {
		return v_Id;
	}
	public void setV_Id(int v_Id) {
		this.v_Id = v_Id;
	}
	public String getV_Name() {
		return v_Name;
	}
	public void setV_Name(String v_Name) {
		this.v_Name = v_Name;
	}

}
