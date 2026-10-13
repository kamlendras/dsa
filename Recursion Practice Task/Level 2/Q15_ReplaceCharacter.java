import java.util.Scanner;

public class Q15_ReplaceCharacter {
    static String replace(String s, char oldChar, char newChar) {
        if (s.isEmpty()) return s;
        char first = s.charAt(0) == oldChar ? newChar : s.charAt(0);
        return first + replace(s.substring(1), oldChar, newChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);
        System.out.println(replace(s, oldChar, newChar));
    }
}
