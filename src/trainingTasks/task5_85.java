package trainingTasks;

public class task5_85 {

    public static void poleNum(String x) {
        int length = x.length();
        boolean isPalindrome = true;

        for (int i = 0; i < (length / 2); i++) {
            if (x.charAt(i) != x.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }

    public static void main(String[] args) {
        poleNum("12322");
    }
}
