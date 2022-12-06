package trainingTasks;

import java.io.BufferedReader;              // number 94
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_114_a {

    public static void YmdFunc(int g, int m, int d) {
        switch (m) {
            case 1 -> {
                String jan = (d > 1) && (d <= 31) ? (d - 1) + " January " + g : "31 December " + (g - 1);
                System.out.println(jan);
            }
            case 2 -> {
                String feb = (d > 1) && (d <= 28) ? (d - 1) + " February " + g : "31 January " + g;
                System.out.println(feb);
            }
            case 3 -> {
                String mar = (d > 1) && (d <= 31) ? (d - 1) + " March " + g : "30 February " + g;
                System.out.println(mar);
            }
            case 4 -> {
                String apr = (d > 1) && (d <= 30) ? (d - 1) + " April " + g : "31 March " + g;
                System.out.println(apr);
            }
            case 5 -> {
                String may = (d > 1) && (d <= 31) ? (d - 1) + " May " + g : "30 April " + g;
                System.out.println(may);
            }
            case 6 -> {
                String jun = (d > 1) && (d <= 30) ? (d - 1) + " June " + g : "31 May " + g;
                System.out.println(jun);
            }
            case 7 -> {
                String jul = (d > 1) && (d <= 31) ? (d - 1) + " July " + g : "30 June " + g;
                System.out.println(jul);
            }
            case 8 -> {
                String aug = (d > 1) && (d <= 31) ? (d - 1) + " August " + g : "31 July " + g;
                System.out.println(aug);
            }
            case 9 -> {
                String sep = (d > 1) && (d <= 30) ? (d - 1) + " September " + g : "31 August " + g;
                System.out.println(sep);
            }
            case 10 -> {
                String oct = (d > 1) && (d <= 31) ? (d - 1) + " October " + g : "30 September " + g;
                System.out.println(oct);
            }
            case 11 -> {
                String nov = (d > 1) && (d <= 30) ? (d - 1) + " November " + g : "31 October " + g;
                System.out.println(nov);
            }
            case 12 -> {
                String dec = (d > 1) && (d <= 31) ? (d - 1) + " December " + g : "30 November " + g;
                System.out.println(dec);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumG = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumM = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumD = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers of Year, month, date: ");

        int g = Integer.parseInt(myNumG.readLine());
        int m = Integer.parseInt(myNumM.readLine());
        int d = Integer.parseInt(myNumD.readLine());

        YmdFunc(g, m, d);
    }
}
