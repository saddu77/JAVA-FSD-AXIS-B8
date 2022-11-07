package javacollections;

import java.util.stream.Collectors;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new LinkedList<Product>();
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
		
		List<Float> productsPriceList = 
				(List<Float>) productsList.stream()
				   .filter(p -> p.price == 30000)
				   .map(p -> p.price)
				   .collect(Collectors.toList());
		
		System.out.println(productsPriceList);
	}

}
