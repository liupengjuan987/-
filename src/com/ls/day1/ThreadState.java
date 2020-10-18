package com.ls.day1;

public class ThreadState {
	static class MyThread extends Thread{
		public void run() {
			System.out.println(this.getState());//runnable
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Thread t = new MyThread();
		System.out.println(t.getState());//new
		t.start();
		try {
			t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getState());  //terminated
	}
}
