import java.util.Scanner;

public class Q14_FibonacciSeries {
    static void fibonacci(long a, long b, int remaining) {
        if (remaining <= 0) {
            return;
        }
        System.out.print(a);
        if (remaining > 1) {
            System.out.print(" ");
        }
        fibonacci(b, a + b, remaining - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(0, 1, n);
        System.out.println();
        sc.close();
    }
}
