import java.util.Scanner;

public class Q21_ReplaceCharacter {
    static String replaceChar(String s, char c1, char c2, int index) {
        if (index == s.length()) {
            return "";
        }
        char current = s.charAt(index) == c1 ? c2 : s.charAt(index);
        return current + replaceChar(s, c1, c2, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = sc.nextLine().trim().split("\\s+");
        char c1 = parts[0].charAt(0);
        char c2 = parts[1].charAt(0);
        System.out.printf("%s%n", replaceChar(s, c1, c2, 0));
        sc.close();
    }
}
