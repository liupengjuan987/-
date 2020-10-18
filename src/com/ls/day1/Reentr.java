package com.ls.day1;

import java.util.concurrent.TimeUnit;

public class Reentr {
	
	synchronized void m() {
		System.out.println("m start");
		try {
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" m end");
	}
	public static void main(String[] args) {
		new T().m();
	}
//	synchronized void m1() {
//		System.out.println("m1 start");
//		try {
//			TimeUnit.SECONDS.sleep(1);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		m2();
//		System.out.println("m1 end");
//	}
//	synchronized void m2() {
//		try {
//			TimeUnit.SECONDS.sleep(2);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("m2");
//	}
//	public static void main(String[] args) {
//		new Reentr().m1();
//	}
//	
	
//	public synchronized void m1() {
//		System.out.println(Thread.currentThread().getName()+" m1 start...");
//		try {
//			Thread.sleep(10000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(Thread.currentThread().getName()+" m1 end...");
//	}
//	public void m2() {
//		try {
//			Thread.sleep(5000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(Thread.currentThread().getName()+" m2 ");
//	}
//	public static void main(String[] args) {
//		Reentr re = new Reentr();
////		new Thread(()->re.m1(),"re1").start();
////		new Thread(()->re.m2(),"re2").start();
//		new Thread(re::m1,"re1").start();
//		new Thread(re::m2,"re2").start();
////	 1.8之前的写法	
////		new Thread(new Runnable() {
////			public void run() {
////				re.m1();
////			}
////		});
//	}
}
class T extends Reentr{
	synchronized void m() {
		System.out.println(" child m start");
		super.m();
		System.out.println("child m end");
	}
}

