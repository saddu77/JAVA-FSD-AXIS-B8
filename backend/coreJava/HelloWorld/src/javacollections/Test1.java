package javacollections;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1,"Laptop",40000f));
		productsList.add(new Product(2,"Laptop",30000f));
		productsList.add(new Product(3,"Laptop",20000f));
		productsList.add(new Product(4,"Laptop",20000f));
		productsList.add(new Product(5,"Laptop",10000f));
		productsList.add(new Product(6,"Laptop",50000f));
		productsList.add(new Product(7,"Laptop",80000f));
		productsList.add(new Product(8,"Laptop",220000f));
		productsList.add(new Product(9,"Laptop",23000f));
		productsList.add(new Product(10,"Laptop",50000f));
		
		List<Float> productPriceList = new ArrayList<Float>();
		for(Product prod: productsList) {
			//filter
			if(prod.price < 30000) {
				productPriceList.add(prod.price);
			}
		}
		
		System.out.println(productPriceList);
	}

}
