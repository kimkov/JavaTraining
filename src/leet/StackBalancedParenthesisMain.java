package leet;

public class StackBalancedParenthesisMain {
	public static void main(String[] args) {
	
		String s = new String("((((())))");
		
		if(StackBalancedParenthesis.isBalancedParentheses(s) == true) {
			System.out.println("String is Balanced parentheses!");
		} else {
			System.out.println("String is not Balanced parentheses!");
		}
	}
}
