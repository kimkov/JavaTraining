package trainingTasks;

import java.util.List;

class Solution2 {
	public List<String> FizzBuzz(int n) {
		List<String> answer = null;
		
		for(int i = 0; i <= n; i++) {
			boolean DivBy3 = i % 3 == 0;
			boolean DivBy5 = i % 5 == 0;
			
			String curStr = "";
			
			if (DivBy3) {
				curStr += "Fizz";
			} 
			if (DivBy5) {
				curStr += "Buzz";
			} 
			if (curStr.isEmpty()) {
				curStr += String.valueOf(i);
			}
			
			answer.add(curStr);
		}
		
		return answer;
	}
}

public class Leet412 {
	public static void main(String[] args) {
		
	}
}
