package trainingTasks;

class S9 {
	private int x;
	
	S9(int x) {
		this.x = x;
	}
	
	public void setNums(int x) {
		this.x = x;
	}
	
	public int getNums() {
		return x;
	}
	
	public boolean SolS9(int x) {
		boolean result = false;
		
		
	}
}

public class LEET9 {
	public static void main(String[] args) {
		int x = 121;
		
		S9 sl = new S9(x);
		
		if(sl.SolS9(x) == true) {
			System.out.println("IS palindorme");
		} else {
			System.out.println("Is not pali");
		}
	}
}
