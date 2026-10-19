import java.util.Scanner;

public class Q19_CountCharacterOccurrences {
    static int count(String s, char c, int index) {
        if (index == s.length()) {
            return 0;
        }
        int match = s.charAt(index) == c ? 1 : 0;
        return match + count(s, c, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.printf("%d%n", count(s, c, 0));
        sc.close();
    }
}
