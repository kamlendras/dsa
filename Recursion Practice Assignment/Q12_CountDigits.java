import java.util.Scanner;

public class Q12_CountDigits {
    static int countDigits(long n) {
        if (n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.printf("%d%n", countDigits(n));
        sc.close();
    }
}
