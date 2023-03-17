package trainingTasks;

public class AStack1 {
	private Node top;
	private int height;
	
	class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val;
		}
	}
	
	public AStack1(int val) {
		Node newNode = new Node(val);
		top = newNode;
		height = 1;
	}
	
	public AStack1() {}
	
	public void printstack() {
		Node tmp = top;
		while(tmp != null) {
			System.out.print(tmp.val);
			tmp = tmp.next;
		}
	}
	
	public void push(int val) {
		Node newNode = new Node(val);
		if(top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		height++;
	}
	
	public Node pop() {
		if(height == 0) return null;
		Node tmp = top;
		top = top.next;
		tmp.next = null;
		height--;
		
		return tmp;
	}
}
