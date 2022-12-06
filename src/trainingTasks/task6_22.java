package trainingTasks;

class ThreeNum {
    int m = 0;
    int result = 0;
    int FuncThreeNum(int n) {
        if (n == 0) {
            result = 0;
        } else {
            while (n > 0) {
                m = n % 10;
                n /= 10;
                if (m == 3) {
                    result += 1;
                }
            }
        }
        return result;
    }
}

class LastNum {

    int x, y, result;

    int FuncLastNum(int n) {
        x = n % 10;
        do {
            y = n % 10;
            if (x == y) {
                result += 1;
            }
            n /= 10;
        } while (n > 0);
        return result;
    }
}

class EvenNum {
    int result = 0;
    int even = 0;

    int FuncEvenNum(int n) {
        do {
            even = n % 10;
            n /= 10;
            if ((even % 2) == 0) {
                result += 1;
            }
        } while (n > 0);
        return result;
    }
}

class SumBig5 {
    int result = 0, b = 0;

    int FuncSumBig5(int n) {
        if (n == 0) {
            result = 0;
        } else {
            while (n > 0) {
                b = n % 10;
                n /= 10;
                if (b > 5) {
                    result += b;
                }
            }
        }
        return result;
    }
}

class MultiplyBig7 {
    int result = 1, x = 0;

    int FuncMultiplyBig7(int n) {
        do {
            x = n % 10;
            n /= 10;
            if (x > 7) {
                result *= x;
            }
        } while (n > 0);
        return result;
    }
}

class ZeroFive {
    int result = 0, x = 0;

    int FuncZeroFive(int n) {
        do {
            x = n % 10;
            n /= 10;
            if ((x == 0) || (x == 5)) {
                result += 1;
            }
        } while (n > 0);
        return result;
    }
}

public class task6_22 {

    public static void main(String[] args) {
        int n = 35509769;

        ThreeNum df = new ThreeNum();
        LastNum ln = new LastNum();
        EvenNum ev = new EvenNum();
        SumBig5 rt = new SumBig5();
        MultiplyBig7 mt = new MultiplyBig7();
        ZeroFive zf = new ZeroFive();

        System.out.println("Number 3 repeats - " + df.FuncThreeNum(n) + " times");
        System.out.println("Last number is - " + n % 10 + " it repeats - " + ln.FuncLastNum(n) + " times");
        System.out.println("Number " + n + " has " + ev.FuncEvenNum(n) + " even numbers");
        System.out.println("Sum of numbers greater than 5 is - " + rt.FuncSumBig5(n));
        System.out.println("Multiplication of numbers greater than 7 is - " + mt.FuncMultiplyBig7(n));
        System.out.println("0 and 5 repeats - " + zf.FuncZeroFive(n));
    }
}
