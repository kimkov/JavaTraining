package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task4_110 {

    public static void cardsBox(int m, int k) {
        switch (m) {
            case 1 -> {
                System.out.println("Spades");
                switch (k) {
                    case 6 -> System.out.println("6");
                    case 7 -> System.out.println("7");
                    case 8 -> System.out.println("8");
                    case 9 -> System.out.println("9");
                    case 10 -> System.out.println("10");
                    case 11 -> System.out.println("Jack");
                    case 12 -> System.out.println("Queen");
                    case 13 -> System.out.println("King");
                    case 14 -> System.out.println("Ace");
                }
            }
            case 2 -> {
                System.out.println("Clubs");
                switch (k) {
                    case 6 -> System.out.println("6");
                    case 7 -> System.out.println("7");
                    case 8 -> System.out.println("8");
                    case 9 -> System.out.println("9");
                    case 10 -> System.out.println("10");
                    case 11 -> System.out.println("Jack");
                    case 12 -> System.out.println("Queen");
                    case 13 -> System.out.println("King");
                    case 14 -> System.out.println("Ace");
                }
            }
            case 3 -> {
                System.out.println("Diamonds");
                switch (k) {
                    case 6 -> System.out.println("6");
                    case 7 -> System.out.println("7");
                    case 8 -> System.out.println("8");
                    case 9 -> System.out.println("9");
                    case 10 -> System.out.println("10");
                    case 11 -> System.out.println("Jack");
                    case 12 -> System.out.println("Queen");
                    case 13 -> System.out.println("King");
                    case 14 -> System.out.println("Ace");
                }
            }
            case 4 -> {
                System.out.println("Hearts");
                switch (k) {
                    case 6 -> System.out.println("6");
                    case 7 -> System.out.println("7");
                    case 8 -> System.out.println("8");
                    case 9 -> System.out.println("9");
                    case 10 -> System.out.println("10");
                    case 11 -> System.out.println("Jack");
                    case 12 -> System.out.println("Queen");
                    case 13 -> System.out.println("King");
                    case 14 -> System.out.println("Ace");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader myNumM = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myNumK = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter type of card from 1 to 4: ");
        int m = Integer.parseInt(myNumM.readLine());

        System.out.println("Enter the value of card from 6 to 14");
        int k = Integer.parseInt(myNumK.readLine());

        cardsBox(m, k);
    }
}
