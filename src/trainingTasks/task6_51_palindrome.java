package trainingTasks;

class isPale {                          // 178
    int x, num, rev;

    isPale(int x) {
        this.x = x;
    }

    boolean isPalindrome() {
        num = x;
        do {
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        } while (num > 0);
        return rev == x;
    }
}

public class task6_51_palindrome {
    public static void main(String[] args) {
        int x = 123454321;

        isPale pl = new isPale(x);
        System.out.println(pl.isPalindrome() ? "Palindrome" : "Not Palindrome");
    }
}
