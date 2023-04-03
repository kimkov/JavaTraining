package javaLangTR;

class Factor {
	public int FactorN(int x) {
		if(x == 1) return 1;
		return x * FactorN(x - 1);
	}
}

public class FactorialNum {
	public static void main(String[] args) {
		int x = 4;
		
		Factor nb = new Factor();
		
		System.out.print(nb.FactorN(x));
	}
}
