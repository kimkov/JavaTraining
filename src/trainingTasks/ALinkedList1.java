package trainingTasks;

import java.util.LinkedList;

class LL {
	
	// create NODE
	private class Node {
		int val; // declare variable. It could be any variable
		
		// create pointer for next node
		Node next;
	}
	
	// Assing head of the list
	Node head;
	
	void add(int newVal) {
		Node newNode1 = new Node();
		newNode1.val = newVal;
		newNode1.next = head;
		head = newNode1;
	}
	
	public String toString() {
		Node tmp = head;
		String result = "[";
		while(tmp != null) {
			result = result + Integer.toString(tmp.val) + " ";
			tmp = tmp.next;
		}
		result = result + "]";
		return result;
	}
	
}

public class ALinkedList1 {
	public static void main(String[] agrs) {
		LinkedList<Integer> myList = new LinkedList<>();
		
		LL sl = new LL();
		
		
		myList.add(23);
		myList.add(45);
		myList.add(2);
		
		sl.add(7);
		sl.add(9);
		sl.add(44);
		
		System.out.print(myList);
		
		System.out.print(sl);
	}
}
