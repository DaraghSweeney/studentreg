package com.sweeney.daragh.student_reg;

import java.util.ArrayList;

public class module {
	String moduleName,id;
	ArrayList<student> listStudents = new ArrayList<student>();
	
	public module(String modName,String id) {
		this.moduleName = modName;
		this.id = id;
	}
	
	//method to add students
	public void addStudent(student s) {
		listStudents.add(s);
	}
	
	//Getters for the module name,id and the list of enrolled students
	public String getModuleName() {return this.moduleName;}
	public String getModuleID() {return this.id;}
	public ArrayList<student> getListStudents(){return this.listStudents;}
	
	//setters for the module name and id
	public void setModuleName(String s){this.moduleName = s;}
	public void setModuleID(String i){this.id = i;}
}
