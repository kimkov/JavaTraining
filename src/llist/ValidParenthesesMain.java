package llist;

public class ValidParenthesesMain {
	public static void main(String[] args) {
		String s = new String("(((ssss())))");
		
		if(ValidParentheses.isValidParentheses(s) == true) {
			System.out.println("Valid");
		} else {
			System.out.println("NOT Valid");
		}
	}
}
