package com.oops;

class A1{
	void display() {
		System.out.println("welcome from class A1");
	}
}

class B1 extends A1{
	void display() {
		System.out.println("welcome from class B1");
	}
}
public class TestPoly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1();
		obj.display();
	}

}
