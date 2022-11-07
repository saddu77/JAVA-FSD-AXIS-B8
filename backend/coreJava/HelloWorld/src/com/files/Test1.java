package com.files;
import java.io.File;
import java.io.IOException;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C://Users//Siraj//Desktop//Training//info.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File created !!!");
			}else {
				System.out.println("File Not created");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
