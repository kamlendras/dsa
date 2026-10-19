import java.util.Scanner;

public class Q15_GCD {
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.printf("%d%n", gcd(a, b));
        sc.close();
    }
}
