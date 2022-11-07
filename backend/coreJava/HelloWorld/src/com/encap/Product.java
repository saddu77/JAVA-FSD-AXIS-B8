package com.encap;
//POJO 
public class Product {
	
	private int product_id;
	private String product_name;
	
	//setter
	void setProductID(int product_id){
		this.product_id = product_id;
	}
	//getter
	int getProductID(){
		return this.product_id;
	}
	
	void setProductName(String product_name) {
		this.product_name = product_name;
	}
	
	String getProductName(){
		return this.product_name;
	}
	
	
}
