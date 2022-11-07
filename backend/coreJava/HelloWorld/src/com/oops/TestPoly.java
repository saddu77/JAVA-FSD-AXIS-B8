package com.oops;

class Calculate{
	void add(int x,int y) {
		int res;
		res = x + y;
		System.out.println("Sum of two numbers are : " + res);
	}
	
	void add(int x,int y,int z) {
		int res;
		res = x + y + z;
		System.out.println("Sum of three numbers are : " + res);
	}
}
public class TestPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculate obj = new Calculate();
     obj.add(30, 40,50);
     obj.add(60, 60);
	}

}
