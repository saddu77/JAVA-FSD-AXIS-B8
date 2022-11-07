package com.threads;

public class Test4 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Test4();
		Thread t1 = new Thread(r1,"MyThread");
		t1.start();
		
		String name = t1.getName();
		System.out.println(name);
	}	

}
