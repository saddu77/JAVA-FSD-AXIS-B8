package com.threads;

public class Test2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}
