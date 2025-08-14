package com.Internship.Task2;

public class Student {

	private int id;
	private String nm;
	private String grd;

	public Student(int id, String nm, String grd) {

			this.id = id;
			this.nm = nm;
			this.grd = grd;
		}

	public int getId() {
		return id;
	}

	public String getName() {
		return nm;
	}

	public void setName(String nm) {
		this.nm = nm;
	}

	public String getGrade() {
		return grd;
	}

	public void setGrade(String grd) {
		this.grd = grd;
	}

	public String toString() {
		return "Student [ID=" + id + ", Name= " + nm + ", Grade=" + grd + "]";
	}

}
