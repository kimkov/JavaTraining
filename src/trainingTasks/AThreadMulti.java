package trainingTasks;

class NewThreadMulti implements Runnable {
	String name;
	Thread t;
	
	NewThreadMulti(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
	}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " Stopped");
		}
		System.out.println(name + " Ended");
	}
}

public class AThreadMulti {
	public static void main(String[] args) {
		NewThreadMulti nt1 = new NewThreadMulti("One");
		NewThreadMulti nt2 = new NewThreadMulti("Two");
		NewThreadMulti nt3 = new NewThreadMulti("Three");
		
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		
		System.out.println("Thread One working: " + nt1.t.isAlive());
		System.out.println("Thread Two working: " + nt2.t.isAlive());
		System.out.println("Thread Three working: " + nt3.t.isAlive());
		
		try {
			System.out.println("Waiting End of the Thread");
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread stopped");
		}
		System.out.println("Thread One working: " + nt1.t.isAlive());
		System.out.println("Thread Two working: " + nt2.t.isAlive());
		System.out.println("Thread Three working: " + nt3.t.isAlive());
		System.out.println("End of the main thread");
	}
}
