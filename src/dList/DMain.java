package dList;

public class DMain {
	public static void main(String[] args) {
		DoubleList myList = new DoubleList(7);
		
		myList.printDL();
		System.out.println();
		myList.getHead();
		myList.getTail();
		myList.getLength();
	}
}
