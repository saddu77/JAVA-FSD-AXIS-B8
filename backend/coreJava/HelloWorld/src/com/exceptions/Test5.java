package com.exceptions;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		System.out.println(1);
		try {
			System.out.println(name.length());
		}catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		
		System.out.println(3);
	}

}
