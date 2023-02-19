package trainingTasks;

class S125 {
	private String s;
	
	S125(String s) {
		this.s = s;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	public boolean validPalindrome(String s) {
		if(s.isEmpty()) {
			return true;
		} else {
			for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
				while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
					i++;
				}
				while(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
					j--;
				}
				if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
					return false;
				}
			}
			return true;
		}
	}
}

public class LEET125 {
	public static void main(String[] args) {
		String s = new String("A man, a plan, a canal: Panama");
		
		S125 sl = new S125(s);
		
		System.out.println(sl.validPalindrome(s));
	}
}
