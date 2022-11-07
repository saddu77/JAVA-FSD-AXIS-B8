package com.exceptions;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int res;
		System.out.println(1);
		try {
			System.out.println(2);
			res = number/0;
			System.out.println(res);
			System.out.println(3);
		}catch(Exception ex) {
			System.out.println("exception occured !!!");
		}
		System.out.println(4);
	}

}
