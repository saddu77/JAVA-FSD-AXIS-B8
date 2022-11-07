package com.example;

public class Test1 {
	static int i = 100;
	static int addition(int x,int y){
		return x+y;
	}
	
	static String generate_pnr(String source,String dest,String travelDate) {
	
	String pnr = source.charAt(0) + "" + dest.charAt(0)+ "_" +travelDate + "_" + i++;
	return pnr;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		res = addition(30,30);
		System.out.println("Sum of two numbers are:  " + res);
		
		res = addition(50, 50);
		System.out.println("Sum of two numbers are : " + res);
		
		String pnr;
		pnr = generate_pnr("Bangalore","Mumbai","20220830");
		System.out.println("PNR is: " + pnr);
		
		pnr = generate_pnr("Delhi","Mumbai","20220830");
		System.out.println("PNR is: " + pnr);
	}

}
