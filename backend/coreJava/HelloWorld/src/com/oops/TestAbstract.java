package com.oops;

abstract class Welcome {
	
	void display() {
		System.out.println("Welcome to JAVA !!!");
	}
	
	abstract void info();
	
}
public class TestAbstract extends Welcome {

	void info(){
		System.out.println("Info method implementation !!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAbstract obj = new TestAbstract();
		obj.info();
		obj.display();
	}

}
