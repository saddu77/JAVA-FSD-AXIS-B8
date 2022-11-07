package com.exceptions;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class Test9 {

	static void validate(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Not Eligible to Vote !!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(17);
		}catch(InvalidAgeException ex) {
			System.out.println("Exception Handled : " + ex.getMessage());
		}
	}

}
