package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_18 {

    public static void combinationsOfDigits() {
        long pnc = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    if (i != j && i != k && j != k) {
                        pnc++;
                        int num = i * 100 + j * 10 + k;
                        System.out.print(num + " ");
                }
            }
        }
    }
        System.out.println("\n" + "Combinations: " + pnc);
}

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 digits number: ");
        @SuppressWarnings("unused")
		int x = Integer.parseInt(myNum.readLine());
        combinationsOfDigits();
    }
}