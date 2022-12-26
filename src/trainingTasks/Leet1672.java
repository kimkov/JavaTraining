package trainingTasks;

class Solution1 {
	public int maximumWealth(int[][] accounts) {
		int maxWealth = 0;
		
		for(int[] customer : accounts) {
			int c = 0;
			
			for(int bank : customer) {
				c += bank;
			}
			maxWealth = Math.max(maxWealth, c);
		}
		
		return maxWealth;
	}
}

public class Leet1672 {
	public static void main(String[] args) {
		
	}
}
