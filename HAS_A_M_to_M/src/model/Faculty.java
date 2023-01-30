package model;

import java.util.Set;

public class Faculty {
	private int fid;
	private String fname;
	private int yearex;
	private Set<Course> courses;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getYearex() {
		return yearex;
	}
	public void setYearex(int yearex) {
		this.yearex = yearex;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	

}
