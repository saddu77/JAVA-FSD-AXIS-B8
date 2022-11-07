package com.oops;

interface I1{
	void show();
}

//multiple Inheritance
public class TestInterfce implements I1,I2 {

	public void show() {
		System.out.println("Welcome to Java Interface !!!");
	}
	
	public void display() {
		System.out.println("msg from Interafce2-display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterfce i1 = new TestInterfce();
		i1.show();
		
		TestInterfce i2 = new TestInterfce();
		i2.display();
	}

}
