package trainingTasks;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class AStaticImport {
	public static void main(String[] args) {
		double side1, side2;
		double hypot;
		
		side1 = 3.0;
		side2 = 4.0;
		
		hypot = sqrt(pow(side1, 2) + pow(side2, 2));
		System.out.println("With two sides " + side1 + " and " + side2 + " hypotenuza is " + hypot);
	}
}
