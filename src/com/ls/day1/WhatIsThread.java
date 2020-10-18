package com.ls.day1;

import java.util.concurrent.TimeUnit;

public class WhatIsThread {
	public static class T1 extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					TimeUnit.MICROSECONDS.sleep(1);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("T1");
			}
		}
	}
	public static void main(String[] args) {
//		new T1().run();   //  T1输出完毕后 main输出
		new T1().start();  //T1 main交替输出
		for (int i = 0; i < 10; i++) {
			try {
				TimeUnit.MICROSECONDS.sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main");
		}
	}
}
