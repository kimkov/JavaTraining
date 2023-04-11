package trainingTasks;

import java.io.*;

public class APrintWriteDemo {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("Test text");
		int i = -7;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
	}
}
