package trainingTasks;

import java.util.ArrayList;                         // 177

class NumFunc {
    int x, p, s1, s2 = 1, s3, i;
    ArrayList<Integer> arr = new ArrayList<>();

    NumFunc(int x) {
        this.x = x;
    }

    ArrayList<Integer> arrNew() {
        do {
            p = x % 10;
            x /= 10;
            arr.add(i, p);
        } while (x > 0);
        return arr;
    }

    boolean isSumNum() {
        for (Integer integer : arrNew()) {
            s1 += integer;
        }
        return s1 > 10;
    }

    boolean isNumF() {
        for (Integer integer : arrNew()) {
            s2 *= integer;
        }
        return s2 < 50;
    }

    boolean isEven() {
        for (@SuppressWarnings("unused") Integer i : arrNew()) {
            s1 += 1;
        }
        return (s1 % 2) == 0;
    }

    boolean isFour() {
        for (@SuppressWarnings("unused") Integer i : arrNew()) {
            s1 += 1;
        }
        return s1 == 4;
    }

    boolean isFirst() {
        for (@SuppressWarnings("unused") Integer i : arrNew()) {
            s1 = arr.get(0);
        }
        return s1 <= 6;
    }

    boolean isFirstLast() {
        for (@SuppressWarnings("unused") Integer i : arrNew()) {
            s1 = arr.get(0);
            s3 = arr.get(arr.size() - 1);
        }
        return s1 == s3;
    }
}

public class task6_46 {
    public static void main(String[] args) {
        int x = 7812367;

        NumFunc an = new NumFunc(x);
        System.out.println(an.arrNew());

        NumFunc nf = new NumFunc(x);
        System.out.println(nf.isSumNum() ? "Sum greater than 10" : "Sum smaller than 10");

        NumFunc ns = new NumFunc(x);
        System.out.println(ns.isNumF() ? "Multiplication smaller than 50" : "Multiplication greater than 50");

        NumFunc ie = new NumFunc(x);
        System.out.println(ie.isEven() ? "Amount of all numbers is EVEN" : "Amount of all numbers is not EVEN");

        NumFunc ifs = new NumFunc(x);
        System.out.println(ifs.isFour() ? "Number has 4 digits" : "Number does not has 4 digits");

        NumFunc isf = new NumFunc(x);
        System.out.println(isf.isFirst() ? "First digit is smaller or equal than 6" : "First digit is greater than 6");

        NumFunc fl = new NumFunc(x);
        System.out.println(fl.isFirstLast() ? "First and Last are the same" : "NOT same numbers");
    }
}
