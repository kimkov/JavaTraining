package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hours {
    int h, m, sec;

    void hHours(int sec) {
        h = sec / 3600;
        m = (sec - h * 3600) / 60;
        sec = sec - h * 3600 - m * 60;

        System.out.println("Time: " + ((h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":" + (sec < 10 ? "0" + sec : sec)));
    }
}

public class task2_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter amount of seconds: ");

        Hours sec = new Hours();
        sec.sec = Integer.parseInt(myNum.readLine());
        sec.hHours(sec.sec);
    }
}
