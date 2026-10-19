import java.util.Scanner;

public class Q18_BinaryToDecimal {
    static long toDecimal(String s, int index, long acc) {
        if (index == s.length()) {
            return acc;
        }
        return toDecimal(s, index + 1, acc * 2 + (s.charAt(index) - '0'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.printf("%d%n", toDecimal(s, 0, 0));
        sc.close();
    }
}
