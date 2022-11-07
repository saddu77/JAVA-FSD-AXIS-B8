package com.oops;

class Calculate1{
	void add(int x,int y) {
		int res;
		res= x + y;
		System.out.println("Sum of two numbers are: " + res);
	}
	
	void add(double x,double y) {
		double res;
		res= x + y;
		System.out.println("Sum of two numbers are: " + res);
	}
}
public class TestPoly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate1 obj = new Calculate1();
		obj.add(30.08, 21.09);
		obj.add(30, 30);
	}

}
