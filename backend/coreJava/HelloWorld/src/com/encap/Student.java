package com.encap;

public class Student {
	int roll_no;
	String student_name;
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", student_name=" + student_name + "]";
	}
	
	
	
	
}
