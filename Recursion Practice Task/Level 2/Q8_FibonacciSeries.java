import java.util.Scanner;

public class Q8_FibonacciSeries {
    static void fibonacci(int n, long a, long b) {
        if (n == 0) return;
        System.out.println(a);
        fibonacci(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n, 0, 1);
    }
}
