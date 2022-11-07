package com.threads;

public class Test6 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("run method !!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 tobj1 = new Test6();
		Test6 tobj2 = new Test6();
		Test6 tobj3 = new Test6();
		
		System.out.println(tobj1.getPriority());
		System.out.println(tobj2.getPriority());
		System.out.println(tobj3.getPriority());
		
		tobj1.setPriority(6);
		tobj2.setPriority(3);
		tobj3.setPriority(9);
		
		System.out.println("=====================");
		
		System.out.println(tobj1.getPriority());
		System.out.println(tobj2.getPriority());
		System.out.println(tobj3.getPriority());
		//1
		//5
		//10
	}

}
