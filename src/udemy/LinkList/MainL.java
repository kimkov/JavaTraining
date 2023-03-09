package udemy.LinkList;

public class MainL {
	public static void main(String[] args) {
		LinkList list1 = new LinkList(1);
		LinkList list2 = new LinkList(2);
		
		list1.append(1);
		list1.append(2);
		list1.append(3);
		list1.append(4);
		
		list2.append(5);
		list2.append(6);
		list2.append(7);
		list2.append(8);
		
		list1.printL1();
		System.out.println();
		list2.printL1();
		System.out.println();
		list1.getHead();
		list1.getTail();
		list1.getLength();
		
	}
}
