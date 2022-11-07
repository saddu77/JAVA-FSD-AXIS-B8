package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C://Users//Siraj//Desktop//Training//info.txt");
			fw.write("welcome to JAVA !!!");
			fw.close();
			System.out.println("Written into File successfully !!! ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
