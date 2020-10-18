package com.ls.day1;

public class SynClass {
	private static int count = 10;
	public synchronized static void m() {
		count--;
		System.out.println(Thread.currentThread().getName()+" count = "+count);
	}
	public static void mm() {
		synchronized(SynClass.class) {
			count--;
		}
	}
}
