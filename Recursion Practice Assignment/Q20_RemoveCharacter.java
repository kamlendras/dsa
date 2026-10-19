import java.util.Scanner;

public class Q20_RemoveCharacter {
    static String removeChar(String s, char c, int index) {
        if (index == s.length()) {
            return "";
        }
        String rest = removeChar(s, c, index + 1);
        if (s.charAt(index) == c) {
            return rest;
        }
        return s.charAt(index) + rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.printf("%s%n", removeChar(s, c, 0));
        sc.close();
    }
}
