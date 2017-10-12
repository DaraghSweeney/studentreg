package com.sweeney.daragh.student_reg;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class courseProgramme {
	
	String courseName;
	LocalDate startDate;
	LocalDate endDate;
	ArrayList<module> modules = new ArrayList<module>();
	
	public courseProgramme(String name,LocalDate start, LocalDate end) {
		this.courseName = name;
		this.startDate = start;
		this.endDate = end;
	}
	
	//method to add modules
	public void addModule(module m) {modules.add(m);}
	
	//getters for the course name, start and end dates and list of modules
	public String getCourseName() {return this.courseName;}
	public String getStartDate() {return startDate.toString();}
	public String getEndDate() {return endDate.toString();}
	public ArrayList<module> getModules(){return this.modules;}
	
	//setters for the course name,start and end dates
	public void setCourseName(String n) {this.courseName = n;}
	public void setStartDate(LocalDate d) {this.startDate = d;}
	public void setEndDate(LocalDate d) {this.endDate = d;}
}