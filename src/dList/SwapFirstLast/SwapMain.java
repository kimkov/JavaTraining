package dList.SwapFirstLast;

public class SwapMain {
	public static void main(String[] args) {
		SwapLastFirst sl = new SwapLastFirst();
		
		sl.append(1);
		sl.append(2);
		sl.append(3);
		sl.append(4);
		sl.append(5);
		
		sl.printAll();
		System.out.println();
		sl.getHead();
		sl.getTail();
		sl.swapFirstLast();
		sl.printAll();
		System.out.println();
		sl.swapFirstLast();
//		sl.printAll();
	}
}
