package trainingTasks;

enum Apple4 {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class AEnumMethod {
	public static void main(String[] args) {
		Apple4 ap, ap2, ap3;
		
		// get ordered-numbers with ordinal() method
		System.out.println("All constants in Apple with their indexes");
		
		for(Apple a : Apple.values()) {
			System.out.println(a + " " + a.ordinal());
		}
		
		ap = Apple4.RedDel;
		ap2 = Apple4.GoldenDel;
		ap3 = Apple4.RedDel;
		
		System.out.println();
		
		if(ap.compareTo(ap2) < 0) {
			System.out.println(ap + " before " + ap2);
		}
		if(ap.compareTo(ap2) > 0) {
			System.out.println(ap2 + " before " + ap);
		}
		if(ap.compareTo(ap3) == 0) {
			System.out.println(ap + " = " + ap3);
		}
		System.out.println();
		
		if(ap.equals(ap2)) {
			System.out.println("Error!");
		}
		if(ap.equals(ap3)) {
			System.out.println(ap + " = " + ap3);
		}
		if(ap == ap3) {
			System.out.println(ap + " = " + ap3);
		}
	}
}
