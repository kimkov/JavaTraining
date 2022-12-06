package trainingTasks;

import java.io.BufferedReader;                  // 125
import java.io.InputStreamReader;
import java.io.IOException;

public class task5_68_a {

    public static void fiboDrNum(int c) {
        int[] arrC = new int[c];
        int[] arrZ = new int[c];

        arrC[0] = 1;
        arrC[1] = 2;

        arrZ[0] = 1;
        arrZ[1] = 1;

        for (int i = 2; i < arrC.length; i++) {
            arrC[i] = arrC[i - 1] + arrC[i - 2];
        }

        for (int j = 2; j < arrZ.length; j++) {
            arrZ[j] = arrZ[j - 1] + arrZ[j - 2];
        }

        for (int i = 0, j = 0; i < arrC.length; i++, j++) {
            System.out.print(arrC[i] + "/" + arrZ[j] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader numC = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number C: ");
        int c = Integer.parseInt(numC.readLine());

        fiboDrNum(c);
    }
}
