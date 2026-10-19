import java.util.Scanner;

public class Q10_SumOfDigits {
    static long digitSum(long n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.printf("%d%n", digitSum(n));
        sc.close();
    }
}
