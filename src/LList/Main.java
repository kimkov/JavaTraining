package LList;

public class Main {
	public static void main(String[] args) {
		linkedlist myList = new linkedlist(2);
		
		myList.append(3);
		myList.append(4);
		myList.append(5);
		myList.append(6);
		myList.append(7);
		
		myList.prepNode(1);
		myList.getHead();
		myList.getTail();
		myList.getLength();
		
		myList.printlist();
		
		myList.removeFirst();
		
		System.out.println(" ");
		myList.printlist();
	}
}
