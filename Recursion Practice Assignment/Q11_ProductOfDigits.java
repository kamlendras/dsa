import java.util.Scanner;

public class Q11_ProductOfDigits {
    static long digitProduct(long n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * digitProduct(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.printf("%d%n", digitProduct(n));
        sc.close();
    }
}
