package com.exceptions;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 20;
		
		try {
			System.out.println(number/0);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("Finally Block executed !!! ");
		}
	}

}
