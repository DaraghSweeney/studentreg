package com.sweeney.daragh.student_reg;

import org.joda.time.LocalDate;

public class student {
	
	String name,username;
	int age,id;
	LocalDate dob;
	
	public student(String name,int age,int day,int month,int year,int id) {
		LocalDate date = new LocalDate(year,month,day);
		this.dob = date;
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//getters for student name, username, age, id and DOB
	public String getName() {return this.name;}
	public String getUsername() {return this.name+this.age;}
	public int getAge() {return this.age;}
	public int getID() {return this.id;}
	public LocalDate getDOB() {return this.dob;}
	
	//setters for student name, age, id and DOB
	public void getName(String n) {this.name = n;}
	public void getAge(int a) {this.age = a;}
	public void getID(int i) {this.id = i;}
	public void LocalDate(LocalDate date) {this.dob = date;}
	
}