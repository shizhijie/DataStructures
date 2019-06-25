package com.zjs.bwcx.datastructures;

public class PingPong implements Runnable {
	
	synchronized void hit(long n) {
		for (int i = 1; i < 3; i++) {
			System.out.println(n+"-"+i+" ");
		}
	}
	public static void main(String[] args) {
		new Thread(new PingPong()).start();
		new Thread(new PingPong()).start();
	}
	public void run() {
		hit(Thread.currentThread().getId());
	}

}
