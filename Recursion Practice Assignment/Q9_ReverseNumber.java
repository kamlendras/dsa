import java.util.Scanner;

public class Q9_ReverseNumber {
    static long reverse(long n, long acc) {
        if (n == 0) {
            return acc;
        }
        return reverse(n / 10, acc * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.printf("%d%n", reverse(n, 0));
        sc.close();
    }
}
