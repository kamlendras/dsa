import java.util.Scanner;

public class Q3_ReverseNumber {
    static long reverse(long n) {
        if (n == 0) return 0;
        return (n % 10) * (long) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(reverse(n));
    }
}
