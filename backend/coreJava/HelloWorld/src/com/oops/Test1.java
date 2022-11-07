package com.oops;

class A{
	int number1 = 20;
}

class B extends A{
	int number2 = 40;
	int res;
	
	void add() {
		res = number1 + number2;
		System.out.println("sum of two numbers are : " + res);
	}	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.add();
	}

}
