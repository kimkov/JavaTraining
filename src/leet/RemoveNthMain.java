package leet;

public class RemoveNthMain {
	public static void main(String[] args) {
		RemoveNthNode sl = new RemoveNthNode();
		
		sl.append(1);
		sl.append(2);
		sl.append(3);
		sl.append(4);
		sl.append(5);
		
		sl.printAll();
		System.out.println();
		sl.RemoveNthNodeFromEnd(2);
		sl.printAll();
	}
}
