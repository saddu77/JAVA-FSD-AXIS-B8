package com.encap;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setRoll_no(001);
		obj.setStudent_name("Rahul");
		
		System.out.println(obj.getRoll_no() + " " + obj.getStudent_name());
		System.out.println(obj);
	}

}
