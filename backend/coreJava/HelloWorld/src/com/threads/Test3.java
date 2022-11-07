package com.threads;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tobj = new Thread("MyThread");
		tobj.start();
		
		String tname = tobj.getName();
		System.out.println(tname);
	}

}
