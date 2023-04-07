package trainingTasks;

class NewThread1 extends Thread {
	NewThread1 () {
		// create new second thread
		super("demo thread");
		System.out.println("Inner thread: " + this);
	}
	// enter point for the second thread
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Inner thread: " + i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Inner thread stopped");
		}
		System.out.println("End of the inner thread");
	}
}

public class AThreadExtend {
	public static void main(String[] args) {
		NewThread1 nt = new NewThread1();
		nt.start();
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main thread: " + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println("Main thread");
		}
		System.out.println("End of the main thread");
	}
}
