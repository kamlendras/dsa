import java.util.Scanner;

public class Q12_BinaryToDecimal {
    static int toDecimal(String s) {
        if (s.isEmpty()) return 0;
        return (s.charAt(0) - '0') * (1 << (s.length() - 1)) + toDecimal(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toDecimal(s));
    }
}
