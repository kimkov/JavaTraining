package leet;

public class RemoveElemMain {
	public static void main(String[] args) {
		RemoveElemFromLinkedList sl = new RemoveElemFromLinkedList();
		sl.append(1);
		sl.append(5);
		sl.append(3);
		sl.append(4);
		sl.append(1);
		sl.append(2);
		
		
		sl.printL();
		System.out.println();
		sl.RemElem(1);
		sl.printL();
	}
}
