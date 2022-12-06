package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_114 {

    public static void dateNum(int g, int m, int n) {
        switch (m) {
            case 1 -> {
                if (n <= 30){
                    System.out.println((n + 1) + " January " + g);
                } else {
                    System.out.println("1 February " + g);
                }
            }
            case 2 -> {
                if (n <= 27) {
                    System.out.println((n + 1) + " February " + g);
                } else {
                    System.out.println("1 March " + g);
                }
            }
            case 3 -> {
                if (n <= 30) {
                    System.out.println((n + 1) + " March " + g);
                } else {
                    System.out.println("1 April " + g);
                }
            }
            case 4 -> {
                if (n <= 29) {
                    System.out.println((n + 1) + " April " + g);
                } else {
                    System.out.println("1 May " + g);
                }
            }
            case 5 -> {
                if (n <= 30) {
                    System.out.println((n + 1) + " May " + g);
                } else {
                    System.out.println("1 June " + g);
                }
            }
            case 6 -> {
                String june = (n <= 29) ? (n + 1) + " June " + g : "1 July " + g;
                System.out.println(june);
            }
            case 7 -> {
                String july = (n <= 30) ? (n + 1) + " July " + g : " 1 August " + g;
                System.out.println(july);
            }
            case 8 -> {
                String august = (n <= 30) ? (n + 1) + " August " + g : "1 September " + g;
                System.out.println(august);
            }
            case 9 -> {
                String sep = (n <= 29) ? (n + 1) + " September " + g : "1 October " + g;
                System.out.println(sep);
            }
            case 10 -> {
                String oct = (n <= 30) ? (n + 1) + " October " + g : "1 November " + g;
                System.out.println(oct);
            }
            case 11 -> {
                String nov = (n <= 29) ? (n + 1) + " November " + g : "1 December " + g;
                System.out.println(nov);
            }
            case 12 -> {
                String dec = (n <= 30) ? (n + 1) + " December " + g : "1 January " + g + 1;
                System.out.println(dec);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumG = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumM = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumN = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers of Year, month, date: ");

        int g = Integer.parseInt(myNumG.readLine());
        int m = Integer.parseInt(myNumM.readLine());
        int n = Integer.parseInt(myNumN.readLine());

        dateNum(g, m, n);
    }
}
