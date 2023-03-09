package udemy;

public class MainLinks {
	public static void main(String[] args) {
		LinksList l1 = new LinksList();
		LinksList l2 = new LinksList();
		
		l1.appNum(1);
		l1.appNum(2);
		l1.appNum(4);
		
		l2.appNum(1);
		l2.appNum(3);
		l2.appNum(5);
		
		l1.printL();
		System.out.println();
		l2.printL();
	}
}
