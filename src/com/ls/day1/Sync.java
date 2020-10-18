package com.ls.day1;

public class Sync {
	public static void main(String[] args) {
		int count = 10;
		Object o = new Object();
		m(o,count);
	}
	public static void m(Object o,int count) {
		synchronized(o){
			count--;
			System.out.println(Thread.currentThread().getName()+" count="+count);//main count=9
		}
	}
}
