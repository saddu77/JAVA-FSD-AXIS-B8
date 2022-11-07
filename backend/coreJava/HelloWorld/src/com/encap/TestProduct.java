package com.encap;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setProductID(101);
		p1.setProductName("Laptop");		
		System.out.println(p1.getProductID() + " " + p1.getProductName());
		
		Product p2 = new Product();
		p2.setProductID(102);
		p2.setProductName("Desktop");
		System.out.println(p2.getProductID() + " " + p2.getProductName());
		
	}

}
