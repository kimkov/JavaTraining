package javaLangTR;

public class AlgoInsertionSortLL {
	private Node head;
	private Node tail;
	private int length;
	
	class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val;
		}
	}
	
	public AlgoInsertionSortLL(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public AlgoInsertionSortLL() {};
	
	public Node getHead() {
		return head;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public int getLength() {
		return length;
	}
	
	public void makeEmpty() {
		head = null;
		tail = null;
		length = 0;
	}
	
	public void printLIns() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public void appendNumsIns(int val) {
		Node newNode = new Node(val);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public void SortInsNum() {
		// If the list has less than 2 elements, it is already sorted
		if(length < 2) return ;
		
		// Start with a sorted list containing only the first element
		Node sortedListHead = head;
		
		// Start with the second element in the unsorted list
		Node unsortedListHead = head.next;
		
	    // Mark the end of the sorted list
	    sortedListHead.next = null;
		
	    // Iterate over the unsorted list
		while(unsortedListHead != null) {
			// Take the first element in the unsorted list
			Node current = unsortedListHead;
			// Move to the next element in the unsorted list
			unsortedListHead = unsortedListHead.next;
			// If the current element is smaller than the first element of the sorted list
			if(current.val < sortedListHead.val) {
				// Insert the current element at the beginning of the sorted list
				current.next = sortedListHead;
				// Update the sorted list head
				sortedListHead = current;
			} else {
				// Start at the beginning of the sorted list
				Node searchPointer = sortedListHead;
				// Search for the correct insertion point
				while(searchPointer.next != null && current.val > searchPointer.next.val) {
					// Move to the next element in the sorted list
					searchPointer = searchPointer.next;
				}
				// Insert the current element after searchPointer
				current.next = searchPointer.next;
				searchPointer.next = current;
			}
		}
		// Update the head of the sorted list
		head = sortedListHead;
		// Update the tail of the sorted list
		Node tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tail = tmp;
	}
}
