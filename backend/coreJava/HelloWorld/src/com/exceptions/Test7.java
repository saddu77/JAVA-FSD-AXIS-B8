package com.exceptions;

public class Test7 {
	static boolean validate(int number) throws Exception{
		if(number == 0) {
			throw new ArithmeticException();
		}		
		return true;		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 2;
		int res;
		try {
		
			if(validate(num2)) {
				res = num1 /num2;
				System.out.println("Division result is : " + res);
			}else {
				System.out.println("num2 is 0");
			}
			}catch(Exception ex) {
				ex.printStackTrace();
			}		
	}

}
