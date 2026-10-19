import java.util.Scanner;

public class Q16_LCM {
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
        long lcm = a / gcd(a, b) * b;
        System.out.printf("%d%n", lcm);
        sc.close();
    }
}
