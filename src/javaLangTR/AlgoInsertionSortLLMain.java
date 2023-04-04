package javaLangTR;

public class AlgoInsertionSortLLMain {
	public static void main(String[] args) {
		AlgoInsertionSortLL ls = new AlgoInsertionSortLL();
		
		ls.appendNumsIns(5);
		ls.appendNumsIns(4);
		
		ls.printLIns();
		
		System.out.println();
		System.out.println("Head is: " + ls.getHead().val);
		System.out.println("Tail is: " + ls.getTail().val);
		System.out.println();
		
		ls.SortInsNum();
		ls.printLIns();
		
		System.out.println();
		System.out.println("Head is: " + ls.getHead().val);
		System.out.println("Tail is: " + ls.getTail().val);
	}
}
