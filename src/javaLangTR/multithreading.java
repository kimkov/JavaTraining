package javaLangTR;

class newThread implements Runnable {
	Thread t;
	
	newThread() {
		t = new Thread(this, "Demonstrative thread");
		System.out.println("Additional thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Additional thread: " + i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Additional thread stopped");
		}
	}
}

public class multithreading {
	public static void main(String[] args) {
		new newThread();
		
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("main thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread is stopped");
		}
		System.out.println("Main thread finished");
	}
}
