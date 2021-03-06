package org.example.java8;

public class UseRunnable {

	public static void main(String[] args) {
		
/*		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Thread 1");
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Thread 2");
			}
		};*/
		
		Runnable r1 = () -> {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running Thread 1");
		};
		Runnable r2 = () -> System.out.println("Running Thread 2");
		Runnable r3 = () -> System.out.println("Running thread 3");

		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
		
	}

}
