package com.ls.day1;

public class FindFault implements Runnable{
//	private int count = 100;
//	public /*synchronized */void run() {
//		count--;
//		System.out.println(Thread.currentThread().getName()+" count= "+count);
//	}
//	public static void main(String[] args) {
//		FindFault ff = new FindFault();
//		for (int i = 0; i < 100; i++) {
//			new Thread(ff,"Thread"+i).start();
//		}
//	}
	
	private int count = 10;
	public synchronized void run() {
		count--;
		System.out.println(Thread.currentThread().getName()+" count= "+count);
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			FindFault ff = new FindFault();
			new Thread(ff,"Thread"+i).start();
		}
	}
}
