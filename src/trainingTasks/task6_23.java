package trainingTasks;

import java.io.BufferedReader;                      // 160
import java.io.InputStreamReader;
import java.io.IOException;

class IntNumFunc {
    int mx = 0, result = 0;
}

class CountA {
    IntNumFunc a = new IntNumFunc();
    int FuncCountA(int x, int n) {
        do {
            a.mx = x % 10;
            x /= 10;
            if (a.mx == n) {
                a.result += 1;
            }
        } while (x > 0);
        return a.result;
    }
}

class DivZ {
    IntNumFunc b = new IntNumFunc();
    int FuncDivZ(int x, int l) {
        do {
            b.mx = x % 10;
            x /= 10;
            if ((b.mx % l) == 0) {
                b.result += 1;
            }
        } while (x > 0);
        return b.result;
    }
}

class SumZ {
    IntNumFunc bc = new IntNumFunc();

    int FuncSumZ(int x, int c) {
        do {
            bc.mx = x % 10;
            x /= 10;
            if (bc.mx > c) {
                bc.result += bc.mx;
            }
        } while (x > 0);
        return bc.result;
    }
}

class CountXY {
    IntNumFunc bv = new IntNumFunc();

    int FuncCountXY(int x, int a, int b) {
        while (x > 0) {
            bv.mx = x % 10;
            x /= 10;
            if ((bv.mx == a) || (bv.mx == b)) {
                bv.result += 1;
            }
        }
        return bv.result;
    }
}
public class task6_23 {

    public static void main(String[] args) throws IOException {

        int x = 34546231;

        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number for the first task - ");
        int n = Integer.parseInt(myNum.readLine());
        CountA bf = new CountA();
        System.out.println("Number " + n + " repeats  in " + x + " - " + bf.FuncCountA(x, n) + " times");

        BufferedReader myNumZ = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number for the second task - ");
        int l = Integer.parseInt(myNumZ.readLine());
        DivZ rf = new DivZ();
        System.out.println("Numbers which divided by " + l + " is " + rf.FuncDivZ(x, l));

        BufferedReader myNumC = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number for the third task - ");
        int c = Integer.parseInt(myNumC.readLine());
        SumZ tf = new SumZ();
        System.out.println("Sum of the numbers which greater than " + c + " is - " + tf.FuncSumZ(x, c));

        BufferedReader myNumA = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number for the last task - ");
        int a = Integer.parseInt(myNumA.readLine());
        BufferedReader myNumB = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter second number for the last task - ");
        int b = Integer.parseInt(myNumB.readLine());
        CountXY sd = new CountXY();
        System.out.println("Numbers " + a + " and " + b + " repeats " + sd.FuncCountXY(x, a, b));
    }
}
