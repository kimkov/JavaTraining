package trainingTasks;

class Solution4 {
	int x;
	
	Solution4(int x) {
		this.x = x;
	}
	
	int countS() {
		int c = 0;
		while (x > 0) {
			if (x % 2 == 0) {
				x /= 2;
			} else {
				x--;
			}
			c++;
		}
		return c;
	}
}

public class Leet1342 {
	public static void main(String[] args) {
		int x = 14;
		
		Solution4 sl = new Solution4(x);
		
		System.out.println(sl.countS());
	}
}
