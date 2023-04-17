package trainingTasks;

interface NumericTest {
	boolean test(int n);
}

public class ALambdaDemo1 {
	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n % 2) == 0;
		
		if(isEven.test(10)) System.out.println("10 is even number");
		if(!isEven.test(9)) System.out.println("9 is not even number");
		
		NumericTest isNeg = (n) -> n >= 0;
		
		if(isNeg.test(1)) System.out.println("1 is not negative number");
		if(!isNeg.test(-1)) System.out.println("-1 is negative number");
	}
}
