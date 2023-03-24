package leet;

import java.util.Stack;

public class StackBalancedParenthesis {
	
	public static boolean isBalancedParentheses(String parentheses) {
		Stack<Character> stack = new Stack<>();
		for(char c : parentheses.toCharArray()) {
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
