package javaLangTR;

enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}

public class enumFunc {
	public static void main(String[] args) {
		Apple ap;
		System.out.println("константы перечисляемого типа Apple: ");
		
		for(Apple a : Apple.values()) {
			System.out.println(a);
		}
		
		System.out.println();
		
		ap = Apple.valueOf("Winesap");
		System.out.println("переменная ар содержит: " + ap);
	}
}
