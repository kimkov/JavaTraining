package llist;

import java.util.Stack;

public class ValidParentheses {
	
	public static boolean isValidParentheses(String string) {
		Stack<Character> stack = new Stack<>();
		for(char c : string.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			} else if(c == ')') {
				if(stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}		
}
