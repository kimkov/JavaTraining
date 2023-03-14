package llist;

public class DLMain {
	public static void main(String[] args) {
		DoubleList dl = new DoubleList();
		
		dl.append(1);
		dl.append(2);
		dl.append(3);
		
		dl.printDL();
		System.out.println();
		dl.removeLast();
		dl.printDL();
		
		dl.remove(1);
		System.out.println();
		dl.printDL();
	}
}
