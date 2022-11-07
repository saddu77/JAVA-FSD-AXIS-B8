package com.exceptions;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "John";
		System.out.println(name.length());
		try {
			System.out.println(name.charAt(6));
		}catch(StringIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}

}
