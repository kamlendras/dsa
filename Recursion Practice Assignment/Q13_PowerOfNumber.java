import java.util.Scanner;

public class Q13_PowerOfNumber {
    static long power(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long half = power(a, b / 2);
        if (b % 2 == 0) {
            return half * half;
        }
        return half * half * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.printf("%d%n", power(a, b));
        sc.close();
    }
}
