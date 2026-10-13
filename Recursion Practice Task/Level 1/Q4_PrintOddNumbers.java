import java.util.Scanner;

public class Q4_PrintOddNumbers {
    static void print(int n) {
        if (n < 1) return;
        print(n - 1);
        if (n % 2 == 1) System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
