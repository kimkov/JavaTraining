package leet;

class PlusOneFunc {
	public int[] solPlusOne(int[] digits) {
		int n = digits.length;
		
		for (int i = n - 1; i >= 0; --i) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i]++;
				return digits;
			}
		}
		digits = new int[n + 1];
		digits[0] = 1;
		return digits;
	}
}

//for(int i = digits.length - 1; i >= 0; i--) {
//    if(digits[i] < 9) {
//        digits[i] += 1;
//        return digits;
//    }
//    digits[i] = 0;
//}
//digits = new int[digits.length + 1];
//digits[0] = 1;
//return digits;


public class PlusOne {
	public static void main(String[] args) {
		int[] digits = {4,3,2,1};
		
		PlusOneFunc pl = new PlusOneFunc();
		pl.solPlusOne(digits);
	}
}
