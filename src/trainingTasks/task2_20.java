package trainingTasks;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class task2_20 {
    public static int reversedNumS(int x) {     // перевернуть заданное число
        int reversedN = 0;
        while (x != 0) {
            int d = x % 10;
            reversedN = reversedN * 10 + d;
            x /= 10;
        }
        return reversedN;
    }

    public static int reversedNum2S(int x) {    // перевернуть 1 с 2 числом и 3 с 4 числом
        int a, b, c, d;
        a = x / 1000;
        b = (x / 100) % 10;
        c = (x % 100) / 10;
        d = x % 10;
        return 1000 * b + 100 * a + 10 * d + c;
    }

    public static int reversedNum3S(int x) {    // перевернуть 2 с 3 числом
        int n1, n2, n3, n4;
        n1 = x / 1000;
        n2 = (x / 100) % 10;
        n3 = (x % 100) / 10;
        n4 = x % 10;
        return 1000 * n1 + 100 * n3 + 10 * n2 + n4;
    }

    public static int reversedNum4S(int x) {    // перевернуть парами 1 и 2 с 3 и 4 числами
        return ((x % 100) / 10) * 1000 + (x % 10) * 100 + 10 * (x / 1000) + (x / 100) % 10;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 4 digits number: ");

        int x = Integer.parseInt(myNum.readLine());

        System.out.println("The reversed number is - " + reversedNumS(x));
        System.out.println("Reversed 1 with 2 and 3 with 4 - " + reversedNum2S(x));
        System.out.println("Reversed 2 and 3 digits - " + reversedNum3S(x));
        System.out.println("Reversed pairs 1 and 2 with 3 and 4 - " + reversedNum4S(x));
    }
}
