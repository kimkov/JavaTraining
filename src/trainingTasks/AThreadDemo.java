package trainingTasks;

class NewThread implements Runnable {
	
	Thread t;
	
	NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Inner thred");
	}
	// starting point for the second thread
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Inner thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Inner thread stoppped");
		}
		System.out.println("End of the inner thread");
	}
}

public class AThreadDemo {
	public static void main(String[] args) {
//		Thread t = Thread.currentThread();
//		System.out.println("Current thread: " + t);
//		
//		t.setName("NewThread");
//		System.out.println("after name was changed: " + t);
//		
//		try {
//			for(int n = 5; n > 0; n--) {
//				System.out.print(n + " ");
//				Thread.sleep(1000);
//			}
//		} catch(InterruptedException e) {
//			System.out.println("Main thread is stoppped");
//		}
		
		NewThread nt = new NewThread();
		nt.t.start();
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main thread " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread stopped");
		}
		System.out.println("End of the main thread");
	}
}
