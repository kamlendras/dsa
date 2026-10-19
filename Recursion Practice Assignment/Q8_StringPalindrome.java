import java.util.Scanner;

public class Q8_StringPalindrome {
    static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (isPalindrome(s, 0, s.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
