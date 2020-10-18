package com.ls.day1;

public class Syn2 {
	private int count = 10;
//	public void m() {
//		synchronized(this) {
//			count--;
//			System.out.println(Thread.currentThread().getName()+" count ="+count);
//		}
//	}
	public synchronized void m() {
		count--;
		System.out.println(Thread.currentThread().getName()+" count = "+count);
	}
}
