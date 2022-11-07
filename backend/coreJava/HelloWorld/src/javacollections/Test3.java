package javacollections;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(Collections.max(list));
		
		List<Integer> productsMaxNumber = 
				(List<Integer>) list.stream()
				   .filter(p -> p == Collections.max(list))
				   .map(p -> p)
				   .collect(Collectors.toList());
		
		System.out.println(productsMaxNumber);
	}

}
