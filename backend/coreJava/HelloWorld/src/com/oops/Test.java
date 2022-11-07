package com.oops;

class Employee{
	int emp_id;
	String emp_name;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor invoked !!!");
	}
	
	Employee(int emp_id,String emp_name){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	void get_emp_details(){
	System.out.println(this.emp_id + " " + this.emp_name);	
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"John");
		e1.get_emp_details();
		
		Employee e2 = new Employee(102,"Jimmy");
		e2.get_emp_details();
	}

}
