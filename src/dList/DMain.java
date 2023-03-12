package dList;

public class DMain {
	public static void main(String[] args) {
		DoubleList myList = new DoubleList(7);
		myList.append(2);
		myList.append(4);
		myList.append(3);
		myList.append(9);
		myList.append(1);
		
		myList.printDL();
		System.out.println();
		myList.getHead();
		myList.getTail();
		myList.getLength();
		myList.removeLast();
		myList.printDL();
		System.out.println();
		myList.prepend(6);
		myList.printDL();
		System.out.println();
//		System.out.println("Removed element: " + myList.removeFirst().val);
		System.out.println(myList.Dget(3).val);
	}
}
