package trainingTasks;

enum Apple3 {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	private int price;
	
	Apple3(int p) {
		price = p;
	}
	
	int getPrice() {
		return price;
	}
}

public class AEnumConst {
	public static void main(String[] args) {
		Apple3 ap;
		System.out.println("Prise for Apples Winesap - " + Apple3.Winesap.getPrice() + " cents.\n");
		
		System.out.println("Price for all sorts of apples: ");
		for(Apple3 a : Apple3.values()) {
			System.out.println("Types of apples: " + a + " costs " + a.getPrice() + " cents.");
		}
	}
}
