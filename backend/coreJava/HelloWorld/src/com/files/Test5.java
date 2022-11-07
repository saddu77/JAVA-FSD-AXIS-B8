package com.files;

import java.io.File;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C://Users//Siraj//Desktop//Training//info.txt");
		if(f.delete()) {
			System.out.println("File Deleted Successfully");
		}else {
			System.out.println("File Not Deleted !!! ");
		}
	}

}
