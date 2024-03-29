package trainingTasks;

class Q {
	int n;
	boolean valueSet = false;
	synchronized int get() {
		while(!valueSet)
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Catched Exception Interrupted Exception");
			}
			
			System.out.println("Recieved: " + n);
			valueSet = false;
			notify();
			return n;
	}
	
	synchronized void put(int n) {
		while(valueSet)
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Cath Exception Interrupted Exception");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Sent: " + n);
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	Thread t;
	Producer(Q q) {
		this.q = q;
		t = new Thread(this, "Sender");
	}
	
	public void run() {
		int i = 0;
		while(true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	Q q;
	Thread t;
	Consumer(Q q) {
		this.q = q;
		t = new Thread(this, "Consumer");
	}
	
	public void run() {
		while(true) {
			q.get();
		}
	}
}

public class AThreadWaitNotif {
	public static void main(String[] args) {
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.t.start();
		c.t.start();
		
		System.out.println("Press Ctrl+C to stop! ");
	}
}
