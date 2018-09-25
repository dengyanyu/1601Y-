package 进阶.多线程;

import java.util.Iterator;

public class 实现4 extends Thread{
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread t=new 实现4();
			t.setName("线程"+i);
			t.setPriority(i+1);
			t.start();
//			t.join();
		}
	
		System.out.println(Thread.currentThread());//主线程
	}
	
	public void run() {
		System.out.println(Thread.currentThread());
		
	}; 
}
