package com.ps.one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	private int v_Id;
	private String v_Name;
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
