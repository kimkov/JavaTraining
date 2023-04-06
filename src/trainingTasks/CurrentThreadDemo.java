package trainingTasks;

public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		
		t.setName("NewThread");
		System.out.println("after name was changed: " + t);
		
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println("Main thread is stoppped");
		}
	}
}
