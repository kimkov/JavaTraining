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
		int originalX = x;
		int tmp = 0;
		
		while(x > 0) {
			tmp = (tmp * 10) + x % 10;
			x /= 10;
		}

		return tmp == originalX;
	}
}

public class LEET9 {
	public static void main(String[] args) {
		int x = 12-1;
		
		S9 sl = new S9(x);
		
		if(sl.SolS9(x) == true) {
			System.out.println("IS palindorme");
		} else {
			System.out.println("Is not pali");
		}
	}
}
