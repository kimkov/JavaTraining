package leet;

public class RemoveElemMain {
	public static void main(String[] args) {
		RemoveElemFromLinkedList sl = new RemoveElemFromLinkedList();
		sl.append(1);
		sl.append(5);
		sl.append(3);
		sl.append(4);
		
		System.out.println(sl.RemElem(2).val);
	}
}
