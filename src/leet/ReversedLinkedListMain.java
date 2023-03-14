package leet;

public class ReversedLinkedListMain {
	public static void main(String[] args) {
		ReverseLinkedList sl = new ReverseLinkedList();
		
		sl.append(2);
		sl.append(3);
		sl.append(4);
		sl.append(5);
		
		sl.printList();
		System.out.println();
		sl.reversedLinkedL();
		sl.printList();
	}
}
