package llist;

import java.util.Stack;

class SortSol {
	public static void SortStackFunc(Stack<Integer> stack) {
		Stack<Integer> SortedStack = new Stack<>();
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			
			while(SortedStack.isEmpty() && SortedStack.peek() > tmp) {
				stack.push(SortedStack.pop());
			}
			SortedStack.push(tmp);
		}
		while(SortedStack.isEmpty()) {
			stack.push(SortedStack.pop());
		}
		System.out.println(stack);
	}
}

public class SortStack {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(1);
		stack.push(4);
		
		System.out.println("Original stack:");
		System.out.println(stack);
	}
}
