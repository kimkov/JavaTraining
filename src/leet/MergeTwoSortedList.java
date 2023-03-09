package leet;

public class MergeTwoSortedList {
	public static void main(String[] args) {
		LList list1 = new LList();
		LList list2 = new LList();
		
		list1.appN(1);
		list1.appN(3);
		list1.appN(5);
		
		list2.appN(2);
		list2.appN(4);
		
		list1.mergeList(null, null);
		list1.printL();
		
	}
}
