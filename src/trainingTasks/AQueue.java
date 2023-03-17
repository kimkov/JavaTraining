package trainingTasks;

public class AQueue {
	private QNode first;
	private QNode last;
	private int length;
	
	class QNode {
		int val;
		QNode next;
		
		QNode(int val) {
			this.val = val;
		}
	}
	
	public AQueue(int val) {
		QNode newNode = new QNode(val);
		first = newNode;
		last = newNode;
		length = 1;
	}
	
	public void enqueue(int val) {
		QNode newNode = new QNode(val);
		if(length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		length++;
	}
	
	public QNode dequeue() {
		QNode tmp = first;
		if(first == null) {
			return null;
		}
		if(length == 1) {
			first = null;
			last = null;
		} else {
			first = first.next;
			tmp.next = null;
		}
		length--;
		return tmp;
	}
	
	public void printQ() {
		QNode tmp = first;
		while(tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
}
