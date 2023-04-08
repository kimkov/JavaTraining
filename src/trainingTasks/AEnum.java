package trainingTasks;

enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class AEnum {
	public static void main(String[] args) {
		Apple ap;
		
		ap = Apple.RedDel;
		System.out.println("Value of ap: " + ap);
		System.out.println();
		ap = Apple.GoldenDel;
		
		if(ap == Apple.GoldenDel) {
			System.out.println("ap consist of GoldenDel \n");
		}
		
		switch(ap) {
			case Jonathan:
				System.out.println("Apples Jonathan has red collor");
				break;
			case GoldenDel:
				System.out.println("Apples GoldenDel has Yellow color");
				break;
			case RedDel:
				System.out.println("Apples RedDel has red color");
				break;
			case Winesap:
				System.out.println("Apples Winesap has red color");
				break;
			case Cortland:
				System.out.println("Apples Cortland has red color");
				break;
		}
	}
}
