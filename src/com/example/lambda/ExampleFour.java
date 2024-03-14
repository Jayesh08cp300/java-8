package com.example.lambda;

public class ExampleFour {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			synchronized (Class.class) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			System.out.println(Thread.currentThread().getName());
		};
		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();
	}
}
