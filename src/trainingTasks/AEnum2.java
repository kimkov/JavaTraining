package trainingTasks;

enum Apple2 {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class AEnum2 {
	public static void main(String[] args) {
		Apple2 ap;
		System.out.println("All elements in Apple:");
		
		Apple2[] apples = Apple2.values();
		
		for(Apple2 a : apples) {
			System.out.println(a);
		}
		System.out.println();
		
		ap = Apple2.valueOf("Winesap");
		
		System.out.println("ap consist of = " + ap);
	}
}
