package trainingTasks;

class PalindromeRecursive {
    // рекурсивная функция для обращения заданного числа
    int reverse(int x, int rev) {
        // базовый вариант
        if (x == 0) {
            return rev;
        }
        rev = rev * 10 + (x % 10);
        rev = reverse(x / 10, rev);
        return rev;
    }

    // Функция для проверки, является ли заданное число палиндромом или нет
    boolean isPalindrome(int num) {
        int rev = 0;

        // перевернуть `num` и сохранить его в `rev`
        rev = reverse(num, rev);

        // если заданное число равно своему обратному,
        // тогда число является палиндромом
        return (num == rev);
    }
}

public class task6_51_Pali_recur {
    public static void main(String[] args) {
        int x = 24421;

        PalindromeRecursive pr = new PalindromeRecursive();
        System.out.println(pr.isPalindrome(x) ? "Palindrome" : "NOT Palindrome");
    }
}
