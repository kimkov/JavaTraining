package trainingTasks;

import java.util.HashSet;
import java.util.Set;

class S202 {
	private int n;
	
	S202(int n) {
		this.n = n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	public int getNext(int n) {
		int sum = 0;
		while(n > 0) {
			int d = n % 10;
			n /= 10;
			sum += d * d;
		}
		return sum;
	}
	
	public boolean isHappy(int n) {
		Set<Integer> map = new HashSet<>();
		while(n != 1 && !map.contains(n)) {
			map.add(n);
			n = getNext(n);
		}
		return n == 1;
	}
}

public class LEET202 {
	public static void main(String[] args) {
		int n = 19;
		
		S202 sl = new S202(n);
		System.out.println(sl.isHappy(n));
	}
}
