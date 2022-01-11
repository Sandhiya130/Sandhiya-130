package com.marticus.demo.controller;

public class Student {
	
	String studId;
	String studName;
	
	public Student(String studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	

}
